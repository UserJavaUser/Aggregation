package by.htp.country.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.country.entity.City;
import by.htp.country.entity.Country;
import by.htp.country.entity.District;
import by.htp.country.entity.Region;
import by.htp.country.logic.CountryLogic;
import by.htp.country.view.CountryPrinter;

//Создать объект класса Государство, используя классы Область, Район, Город.
//Методы: вывести на консоль столицу, количество областей, площадь, областные центры.  

public class Main {
	
	public static void main(String[] args) {
		
		City city1 = new City("City1");
		City city2 = new City("City2");
		City city3 = new City("City3");
		City capital = new City("Capital");
		
		District district1 = new District(city1, 1456.7);
		District district2 = new District(city2, 1655.7);
		District district3 = new District(city3, 1234.6);
		District district4 = new District(capital, 1543.2);
		
		List<District> first = new ArrayList<District>();
		first.add(district1);
		first.add(district2);
		
		List<District> second = new ArrayList<District>();
		second.add(district3);
		second.add(district4);
		
		Region firstR = new Region(first, "Region1", city1);
		Region secondR = new Region(second, "Region2", capital);
		
		List<Region> regions = new ArrayList<Region>();
		regions.add(firstR);
		regions.add(secondR);
		
		Country country = new Country(regions, capital);
		
		CountryLogic logic = new CountryLogic();
		CountryPrinter printer = new CountryPrinter();
		
		printer.printCapital(country);
		
		int numberOfRegions = logic.countRegions(country);
		printer.printRegions(numberOfRegions);
		
		double area = logic.countArea(country);
		printer.printArea(area);
		
		printer.printRegionMainCities(country);
	}
	
}
