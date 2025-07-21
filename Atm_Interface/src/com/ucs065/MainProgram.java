package com.ucs065;

public class MainProgram {
	public static void main(String[] args) {

		BankAccount userAccount = new BankAccount(1000); // Initial balance ₹1000
		ATM atm = new ATM(userAccount);
		atm.start();
	}
}