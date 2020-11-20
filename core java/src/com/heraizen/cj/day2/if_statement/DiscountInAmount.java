package com.heraizen.cj.day2.if_statement;

import java.util.Scanner;

public class DiscountInAmount {
	public static void main(String[] args) {

		Scanner amt = new Scanner(System.in);
		System.out.println("Enter the billing amount: ");
		int i = amt.nextInt();
		if (i > 6000) {
			i -= i * 0.1f; // i=i-((i*10)/100)
		}
		System.out.println("Your net billing amount: " + i);
		amt.close();

	}

}

/*
 * Write a program to accept the billing amount, if it is > 6000 then give a
 * discount of 10% and display the net amount.
 */