package by.htp.country.view;

import java.util.List;

import by.htp.country.entity.Country;
import by.htp.country.entity.Region;

public class CountryPrinter {

	public void printCapital(Country country) {
		System.out.println("The capital is " + country.getCapital());
	}

	public void printRegions(int numberOfRegions) {
		System.out.println("The number of regions is " + numberOfRegions);
	}

	public void printArea(double area) {
		System.out.println("The area is (square kilometres) " + area);
	}

	public void printRegionMainCities(Country country) {
		List<Region> regions = country.getRegions();
		for(Region region : regions) {
			System.out.println("The main city of the " + region.getName() + " is " + region.getMainCity());
		}
	}
	
	
}
