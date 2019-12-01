package by.htp.country.logic;

import java.util.List;

import by.htp.country.entity.Country;
import by.htp.country.entity.District;
import by.htp.country.entity.Region;

public class CountryLogic {

	public int countRegions(Country country) {
		int regions = country.getRegions().size();
		return regions;
	}

	public double countArea(Country country) {
		List<Region> regions = country.getRegions();
		double area = 0;
		for(Region region : regions) {
			List<District> districts = region.getDistricts();
			for(District district : districts) {
				area += district.getArea();
			}
		}
		return area;
	}
	
}
