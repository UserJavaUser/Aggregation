package by.htp.automobile.logic;

import by.htp.automobile.entity.Car;

public class CarLogic {

	public void drive(Car car, int distance) {
		int fuelAfterDriving = car.getFuel() - (car.getFuelPer100Km() * distance / 100);
		car.setFuel(fuelAfterDriving);
	}
	
	public void refuel(Car car, char answer) {
		switch(answer) {
		case ('Y'):
			car.setFuel(car.getMaxFuel());
			break;
		case ('N'):
			break;
		}
	}
	
	
	
}
