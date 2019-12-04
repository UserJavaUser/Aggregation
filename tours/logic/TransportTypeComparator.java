package by.htp.tours.logic;

import java.util.Comparator;

import by.htp.tours.entity.Tour;

public class TransportTypeComparator implements Comparator<Tour>{

	@Override
	public int compare(Tour o1, Tour o2) {
		return o1.getTransportType().compareTo(o2.getTransportType());
	}

}
