package by.htp.tours.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.htp.tours.entity.FoodType;
import by.htp.tours.entity.Offer;
import by.htp.tours.entity.Tour;
import by.htp.tours.entity.TourType;
import by.htp.tours.entity.TransportType;
import by.htp.tours.logic.FoodTypeComparator;
import by.htp.tours.logic.TourLogic;
import by.htp.tours.logic.TourTypeComparator;
import by.htp.tours.logic.TransportTypeComparator;
import by.htp.tours.view.TourPrinter;

public class Main {
	
	public static void main(String[] args) {
		
		Tour tour1 = new Tour(1, 10, 800, FoodType.BB, TourType.EXCURSION, TransportType.PLANE);
		Tour tour2 = new Tour(2, 2, 200, FoodType.BB, TourType.SHOPPING, TransportType.BUS);
		Tour tour3 = new Tour(3, 3, 400, FoodType.FB, TourType.EXCURSION, TransportType.TRAIN);
		Tour tour4 = new Tour(4, 5, 1200, FoodType.FB, TourType.CRUISE, TransportType.SHIP);
		List<Tour> tours = new ArrayList<Tour>();
		tours.add(tour1);
		tours.add(tour2);
		tours.add(tour3);
		tours.add(tour4);
		
		Offer offer = new Offer(tours);
		TourLogic logic = new TourLogic();
		TourPrinter printer = new TourPrinter();
		
		printer.printTours(offer.getTours());
		int minDay = 3;
		int maxDay = 5;
		List<Tour> toursByDay = logic.findByDays(offer, minDay, maxDay);
		printer.printToursByDays(toursByDay, minDay, maxDay);
		
		FoodType food = FoodType.BB;
		List<Tour> toursByFood = logic.findByFood(offer, food);
		printer.printToursByFood(toursByFood, food);
		
		TransportType transport = TransportType.BUS;
		List<Tour> toursByTransport = logic.findByTransport(offer, transport);
		printer.printToursByTransport(toursByTransport, transport);
		
		Collections.sort(offer.getTours(), new FoodTypeComparator());
		printer.printToursByFood(offer.getTours());
		
		Collections.sort(offer.getTours(), new TourTypeComparator());
		printer.printToursByType(offer.getTours());
		
		Collections.sort(offer.getTours(), new TransportTypeComparator());
		printer.printToursByTransport(offer.getTours());
		
		
	}
}
