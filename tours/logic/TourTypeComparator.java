package by.htp.tours.logic;

import java.util.Comparator;

import by.htp.tours.entity.Tour;

public class TourTypeComparator implements Comparator<Tour> {

	@Override
	public int compare(Tour o1, Tour o2) {
		return o1.getTourType().compareTo(o2.getTourType());
	}

	
}
