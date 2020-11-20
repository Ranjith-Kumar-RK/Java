package com.heraizen.cj.exception_assignment;

import java.util.Scanner;

public class BankAccount {

	int accNo;
	String custName;
	String accType;
	float balance;

	void deposit(float amt, float curBalance) {
		balance = amt + curBalance;
		if (amt < 0) {
			throw new IllegalArgumentException("Negative amount not to be processed");
		}

		System.out.println("In your Account " + amt + " will be credited");
	}

	void withdraw(float amt, float curBalance) {
		balance = curBalance - amt;
		if (balance < 1000) {
			throw new IllegalArgumentException(
					"Insufficient Funds. You must be maintain your minimum balance amount 1000");

		}
		if (amt < 0) {
			throw new IllegalArgumentException("Negative amount not to be processed");
		}
		System.out.println("In your Account " + amt + " will be debited");

	}

	void getBalance(float curBalance) {
		if (curBalance < 0 || curBalance < 1000) {
			throw new IllegalArgumentException("You must be maintain your minimum balance amount 1000");
		}
		System.out.println("In your Account balance is " + curBalance);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float currentBalance = 10000;

		System.out.println("1.Deposit\t2.Withdraw\t3.Check Balance");
		int choice = sc.nextInt();

		BankAccount obj = new BankAccount();

		switch (choice) {
		case 1:
			System.out.println("Enter the deposit amount");
			float depAmout = sc.nextFloat();
			obj.deposit(depAmout, currentBalance);

		case 2:
			System.out.println("Enter the withdraw amount");
			float withDrawAmout = sc.nextFloat();
			obj.withdraw(withDrawAmout, currentBalance);

		case 3:
			obj.getBalance(currentBalance);
		}
		sc.close();

	}

}
