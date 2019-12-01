package by.htp.automobile.entity;

import java.util.List;

public class Car {

	private String tradeMark;
	private List<Wheel> wheels;
	private Engine engine;
	private int fuelPer100Km;
	private int fuel;
	private int maxFuel;
	
	public Car() {
		
	}

	public Car(String tradeMark, List<Wheel> wheels, Engine engine, int fuelPer100Km, int fuel, int maxFuel) {
		this.tradeMark = tradeMark;
		this.wheels = wheels;
		this.engine = engine;
		this.fuelPer100Km = fuelPer100Km;
		this.fuel = fuel;
		this.maxFuel = maxFuel;
	}

	public String getTradeMark() {
		return tradeMark;
	}

	public void setTradeMark(String tradeMark) {
		this.tradeMark = tradeMark;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getFuelPer100Km() {
		return fuelPer100Km;
	}

	public void setFuelPer100Km(int fuelPer100Km) {
		this.fuelPer100Km = fuelPer100Km;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	
	public int getMaxFuel() {
		return maxFuel;
	}

	public void setMaxFuel(int maxFuel) {
		this.maxFuel = maxFuel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + fuel;
		result = prime * result + fuelPer100Km;
		result = prime * result + maxFuel;
		result = prime * result + ((tradeMark == null) ? 0 : tradeMark.hashCode());
		result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (fuel != other.fuel)
			return false;
		if (fuelPer100Km != other.fuelPer100Km)
			return false;
		if (maxFuel != other.maxFuel)
			return false;
		if (tradeMark == null) {
			if (other.tradeMark != null)
				return false;
		} else if (!tradeMark.equals(other.tradeMark))
			return false;
		if (wheels == null) {
			if (other.wheels != null)
				return false;
		} else if (!wheels.equals(other.wheels))
			return false;
		return true;
	}

}
