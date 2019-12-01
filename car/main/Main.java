package by.htp.automobile.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.automobile.entity.Car;
import by.htp.automobile.entity.Engine;
import by.htp.automobile.entity.Wheel;
import by.htp.automobile.logic.CarLogic;
import by.htp.automobile.view.CarPrinter;

public class Main {
	
	public static void main(String[] args) {
		
		Wheel wheel = new Wheel(195, 635);
		List<Wheel> wheels = new ArrayList<Wheel>();
		wheels.add(wheel);
		wheels.add(wheel);
		wheels.add(wheel);
		wheels.add(wheel);
		int power = 120;
		Engine engine = new Engine(power);
		int fuel = 120;
		int maxFuel = 120;
		int fuelPer100Km = 5;
		Car car = new Car("My Car", wheels, engine, fuelPer100Km, fuel, maxFuel);
		
		CarPrinter printer = new CarPrinter();
		CarLogic logic = new CarLogic();
		printer.printTrademark(car);
		
		int distance = printer.enterDistance();
		logic.drive(car, distance);
		printer.printFuel(car);
		
		char answerRefuel = printer.askForRefuel();
		logic.refuel(car, answerRefuel);
		printer.printFuel(car);
		
		char answerChangeWheel = printer.askForWheelChange();
		printer.printWheelsCondition(answerChangeWheel);	

	}
	
}
