package by.htp.client.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.client.entity.AccountStatus;
import by.htp.client.entity.BankAccount;
import by.htp.client.entity.Client;
import by.htp.client.logic.ClientLogic;
import by.htp.client.view.ClientPrinter;

public class Main {

	public static void main(String[] args) {
		BankAccount first = new BankAccount(923, 40, AccountStatus.ACTIVE);
		BankAccount second = new BankAccount(129, 740, AccountStatus.ACTIVE);
		BankAccount third = new BankAccount(168, -0.9, AccountStatus.ACTIVE);
		List<BankAccount> accounts = new ArrayList<BankAccount>();
		accounts.add(first);
		accounts.add(second);
		accounts.add(third);
		
		Client client = new Client(1, "Ivanov", "Ivan", accounts);
		ClientLogic logic = new ClientLogic();
		ClientPrinter printer = new ClientPrinter();
		
		int number = printer.accountForFinding();
		BankAccount accountByNumber = logic.findByNumber(client, number);
		printer.printBankAccount(accountByNumber);
		
		int numberForBlocking = printer.accountForBlocking();
		BankAccount blockedAccount = logic.blockAccount(client, numberForBlocking);
		printer.printBlockedBankAccount(blockedAccount);
		
		int numberForUnblocking = printer.accountForUnblocking();
		BankAccount unblockedAccount = logic.unblockAccount(client, numberForUnblocking);
		printer.printUnblockedBankAccount(unblockedAccount);
		
		double clientBalance = logic.getClientBalance(client);
		printer.printClientBalance(clientBalance);
		
		double positiveSum = logic.findPositiveSum(client);
		printer.printPositiveSum(positiveSum);
		
		double negativeSum = logic.findNegativeSum(client);
		printer.printNegativeSum(negativeSum);

		
	}
}
