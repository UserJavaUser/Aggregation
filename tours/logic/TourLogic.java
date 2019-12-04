package by.htp.tours.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.tours.entity.FoodType;
import by.htp.tours.entity.Offer;
import by.htp.tours.entity.Tour;
import by.htp.tours.entity.TransportType;

public class TourLogic{
	
	public List<Tour> findByDays(Offer offer, int minDay, int maxDay){
		List<Tour> list = new ArrayList<Tour>();
		for(Tour tour : offer.getTours()) {
			if(tour.getDay() >= minDay && tour.getDay() <= maxDay) {
				list.add(tour);
			}
		}
		return list;
	}
	
	public List<Tour> findByFood(Offer offer, FoodType food){
		List<Tour> list = new ArrayList<Tour>();
		for(Tour tour : offer.getTours()) {
			if(tour.getFoodType().equals(food)) {
				list.add(tour);
			}
		}
		return list;
	}
	
	public List<Tour> findByTransport(Offer offer, TransportType transport){
		List<Tour> list = new ArrayList<Tour>();
		for(Tour tour : offer.getTours()) {
			if(tour.getTransportType().equals(transport)) {
				list.add(tour);
			}
		}
		return list;
	}

}
