package com.heraizen.cj.day1;

import java.util.Scanner;

public class InterestsCalculation {

	public static void main(String[] args) {

		Scanner amt = new Scanner(System.in);
		System.out.println("Enter principal amount: ");
		int principalAmt = amt.nextInt();
		System.out.println("Enter rate of interest: ");
		float interest = amt.nextFloat();
		System.out.println("Enter the time (years): ");
		int duration = amt.nextInt();

		float simpleInterest = (principalAmt * interest * duration) / 100;

		System.out.println("Simple interest is " + simpleInterest);
		amt.close();
	}

}

/*
 * Write a program to accept the principal amount, rate of interest, time and
 * calculate the simple interest.
 */