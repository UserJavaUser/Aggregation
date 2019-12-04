package by.htp.tours.view;

import java.util.List;

import by.htp.tours.entity.FoodType;
import by.htp.tours.entity.Tour;
import by.htp.tours.entity.TransportType;

public class TourPrinter {

	public void printTours(List<Tour> tours) {
		for(Tour tour : tours) {
			System.out.println(tour.toString());
		}
	}
	
	public void printToursByDays(List<Tour> tours, int minDay, int maxDay) {
		System.out.println("Tours from " + minDay + " to " + maxDay + " are ");
		for(Tour tour : tours) {
			System.out.println(tour.toString());
		}
	}

	public void printToursByFood(List<Tour> tours, FoodType food) {
		System.out.println("Tours with " + food);
		for(Tour tour : tours) {
			System.out.println(tour.toString());
		}
	}
	
	public void printToursByTransport(List<Tour> tours, TransportType transport) {
		System.out.println(transport + " tours :");
		for(Tour tour : tours) {
			System.out.println(tour.toString());
		}
	}

	public void printToursByFood(List<Tour> tours) {
		System.out.println("Tours are sorted by food type :");
		printTours(tours);
	}

	public void printToursByTransport(List<Tour> tours) {
		System.out.println("Tours are sorted by transport type :");
		printTours(tours);
	}

	public void printToursByType(List<Tour> tours) {
		System.out.println("Tours are sorted by its type :");
		printTours(tours);
		
	}
	
}
