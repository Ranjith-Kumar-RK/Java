package com.heraizen.cj.day2.if_statement;

import java.util.Scanner;

public class ConvertNegativeNumberIntoPositiveNumber {
	public static void main(String[] args) {

		Scanner var = new Scanner(System.in);
		System.out.println("Enter number: ");
		int i = var.nextInt();
		if (i < 0) {
			i *= -1;
		}
		System.out.println("The result is "+i);
		var.close();

	}
}

/*
 * Write a program to accept a number, if it is negative then covert it to a
 * positive number.
 */