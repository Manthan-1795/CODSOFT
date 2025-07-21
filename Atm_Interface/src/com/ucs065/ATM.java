package com.ucs065;

import java.util.InputMismatchException;
import java.util.Scanner;

class ATM {

	private BankAccount account;
	private Scanner sc = new Scanner(System.in);

	public ATM(BankAccount account) {
		this.account = account;
	}

	public void start() {
		int choice;
		try {
			do {
				System.out.println("1. Check Balance");
				System.out.println("2. Deposit");
				System.out.println("3. Withdraw");
				System.out.println("4. Exit");
				System.out.print("Choose An Option: ");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					checkBalance();
					break;
				case 2:
					deposit();
					break;
				case 3:
					withdraw();
					break;
				case 4:
					System.out.println("-------------------------------------");
					System.out.println("Thank You For using The ATM.");
					System.out.println("-------------------------------------");
					break;
				default:
					System.out.println("-------------------------------------");
					System.out.println("Invalid Choice !! Try Again!!");
					System.out.println("-------------------------------------");
				}
			} while (choice != 4);
		} catch (InputMismatchException e) {
			System.out.println("-------------------------------------");
			System.out.println("Input Mismatch(Numbers Only)!! \nExiting Program ...");
			System.out.println("-------------------------------------");
		}
	}

	public void checkBalance() {
		System.out.println("-------------------------------------");
		System.out.printf("Current balance: %.2f\n", account.getBalance());
		System.out.println("-------------------------------------");
	}

	public void deposit() {
		System.out.print("Enter Amount to Deposit: ");
		double amount = sc.nextDouble();
		if (amount <= 0) {
			System.out.println("-------------------------------------");
			System.out.println("Invalid deposit amount.");
			System.out.println("-------------------------------------");
		} else {
			account.deposit(amount);
			System.out.println("-------------------------------------");
			System.out.println("Deposit successful.");
			System.out.println("-------------------------------------");
		}
	}

	public void withdraw() {
		System.out.print("Enter amount to withdraw: ");
		double amount = sc.nextDouble();
		if (account.withdraw(amount)) {
			System.out.println("-------------------------------------");
			System.out.println("Withdrawal successful.");
			System.out.println("-------------------------------------");
		} else {
			System.out.println("-------------------------------------");
			System.out.println("Insufficient balance or invalid amount.");
			System.out.println("-------------------------------------");
		}
	}
}
