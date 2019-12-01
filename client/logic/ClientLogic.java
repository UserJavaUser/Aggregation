package by.htp.client.logic;

import java.util.List;

import by.htp.client.entity.AccountStatus;
import by.htp.client.entity.BankAccount;
import by.htp.client.entity.Client;

public class ClientLogic {

	public double getClientBalance(Client client) {
		List<BankAccount> accounts = client.getAccounts();
		double clientBalance = 0;
		for(BankAccount account : accounts) {
			clientBalance += account.getBalance();
		}
		return clientBalance;
	}

	public double findPositiveSum(Client client) {
		List<BankAccount> accounts = client.getAccounts();
		double clientBalance = 0;
		for(BankAccount account : accounts) {
			if(account.getBalance() > 0) {
				clientBalance += account.getBalance();
			}
		}
		return clientBalance;
	}

	public double findNegativeSum(Client client) {
		List<BankAccount> accounts = client.getAccounts();
		double clientBalance = 0;
		for(BankAccount account : accounts) {
			if(account.getBalance() < 0) {
				clientBalance += account.getBalance();
			}
		}
		return clientBalance;
	}

	public BankAccount findByNumber(Client client, int number) {
		List<BankAccount> accounts = client.getAccounts();
		for(BankAccount account : accounts) {
			if(number == account.getNumber()) {
				return account;
			}
		}
		return null;
	}

	public BankAccount blockAccount(Client client, int numberForBlocking) {
		List<BankAccount> accounts = client.getAccounts();
		for(BankAccount account : accounts) {
			if(numberForBlocking == account.getNumber()) {
				account.setStatus(AccountStatus.BLOCKED);
				return account;
			}
		}
		return null;
	}

	public BankAccount unblockAccount(Client client, int numberForUnblocking) {
		List<BankAccount> accounts = client.getAccounts();
		for(BankAccount account : accounts) {
			if(numberForUnblocking == account.getNumber()) {
				account.setStatus(AccountStatus.ACTIVE);
				return account;
			}
		}
		return null;
	}
	
	
}
