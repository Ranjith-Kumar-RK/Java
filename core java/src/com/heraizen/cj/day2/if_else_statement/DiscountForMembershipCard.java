package com.heraizen.cj.day2.if_else_statement;

import java.util.Scanner;

public class DiscountForMembershipCard {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount: ");
		int amt = sc.nextInt();
		System.out.println("Do you have a membership card?");
		String val = sc.next();
		int discount;
		int total;

		if (val.equals("Y")) {
			discount = (amt * 10) / 100;
			total = amt - discount;
		} else {
			discount = (amt * 3) / 100;
			total = amt - discount;
		}
		System.out.println("Thank you! Your total bill amount is Rs " + amt + ", discount is Rs " + discount
				+ " and net amount payable is Rs " + total + ".");
		sc.close();

	}
}

/*
 * In a shopping mall, privileged customers (if they have a membership card) are
 * being given a 10% discount on the billed amount, and the others are being
 * given a 3% discount. Write a program to accept the billing amount and confirm
 * the membership card from the customer; calculate and display the net amount
 * to be paid by the customer.
 */