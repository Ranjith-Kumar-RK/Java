package com.heraizen.cj.day2.if_statement;

import java.util.Scanner;

public class MembershipEligibilityChecking {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter mobile number: ");
		double num = sc.nextDouble();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		String message = "\"Sorry! You need to be at least 18 years old to get membership.\"";
		String firstLetter = name.substring(0, 1);
		String remainingLetters = name.substring(1, name.length());
		firstLetter = firstLetter.toUpperCase();
		name = firstLetter + remainingLetters;
		if (age > 18) {
			message = "\"Congratulations \"" + name + "\" for your successfull registration.\"";
			System.out.println(message);
			return;
		}
		System.out.println(message);

		sc.close();

	}
}

/*
 * The Sports Club registration form has the following details: name, mobile
 * number and age. Per the membership policy, the person should be at least 18
 * years old to become a member. Write a program to accept the details mentioned
 * above; if the age is >18 years then display the entered details with a
 * congratulatory message, else the following message should be displayed
 * “Sorry! You need to be at least 18 years old to get membership.”
 */