package com.ucs065;

class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
}
