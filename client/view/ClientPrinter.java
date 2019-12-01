package by.htp.client.view;

import java.util.Scanner;

import by.htp.client.entity.BankAccount;

public class ClientPrinter {

	public void printClientBalance(double balance) {
		System.out.println("Client's balance is " + balance);
	}

	public void printPositiveSum(double positiveSum) {
		System.out.println("Client's positive balance is " + positiveSum);
	}

	public void printNegativeSum(double negativeSum) {
		System.out.println("Client's negative balance is " + negativeSum);
		
	}

	public void printBankAccount(BankAccount accountByNumber) {
		if(accountByNumber != null) {
			System.out.println(accountByNumber.toString());
		}
		else {
			System.out.println("Account isn't found");
		}
	}

	public void printBlockedBankAccount(BankAccount accountByNumber) {
		if(accountByNumber != null) {
			System.out.println("Account is blocked");
			System.out.println(accountByNumber.toString());
		}
		else {
			System.out.println("Account isn't found");
		}
	}
	
	public void printUnblockedBankAccount(BankAccount unblockedAccount) {
		if(unblockedAccount != null) {
			System.out.println("Account is blocked");
			System.out.println(unblockedAccount.toString());
		}
		else {
			System.out.println("Account isn't found");
		}
		
	}
	
	public int accountForBlocking() {
		System.out.println("Enter number of account you want to block");
		int value = enterValueFromConsole();
		return value;
	}
	
	public int accountForUnblocking() {
		System.out.println("Enter number of account you want to unblock");
		int value = enterValueFromConsole();
		return value;
	}
	
	public int accountForFinding() {
		System.out.println("Enter number of account you want to find");
		int value = enterValueFromConsole();
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


}
