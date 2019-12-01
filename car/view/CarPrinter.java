package by.htp.automobile.view;

import java.util.Scanner;

import by.htp.automobile.entity.Car;

public class CarPrinter {
	
	public void printTrademark(Car car) {
		System.out.println(car.getTradeMark());
	}
	
	public void printFuel(Car car) {
		System.out.println("The fuel is " + car.getFuel());
	}
	
	public int enterDistance() {
		System.out.println("How long(km) is your trip");
		int distance = enterValueFromConsole();
		while(distance <= 0) {
			distance = enterValueFromConsole();
		}
		return distance;
	}
	
	public char askForRefuel() {
		System.out.println("Do you want to refuel? (Y/N)");
		char answer = enterCharFromConsole();
		return answer;
	}
	
	public char askForWheelChange() {
		System.out.println("Do you want to change wheel? (Y/N)");
		char answer = enterCharFromConsole();
		return answer;
	}
	
	@SuppressWarnings("resource")
	private char enterCharFromConsole() {
		char value;
		String message = "Enter answer";
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while(!sc.hasNext()) {
			sc.hasNext();
			System.out.println(message);
		}
		value = sc.next().charAt(0);
		return value;
	}

	@SuppressWarnings("resource")
	private int enterValueFromConsole() {
		int value = 0;
		String message = "Enter value";
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while(!sc.hasNextInt()) {
			sc.hasNext();
			System.out.println(message);
		}
		value = sc.nextInt();
		return value;
	}

	public void printWheelsCondition(char answer) {
		switch(answer) {
		case ('Y'):
			System.out.println("The wheel is changed");
			break;
		case ('N'):
			System.out.println("The wheel isn't changed");
			break;
		}
		
	}
	
}
