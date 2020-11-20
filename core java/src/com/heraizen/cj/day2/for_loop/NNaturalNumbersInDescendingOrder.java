package com.heraizen.cj.day2.for_loop;

import java.util.Scanner;

public class NNaturalNumbersInDescendingOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int N = sc.nextInt();

		System.out.print("The first " + N + " natural numbers in descending order are: ");
		for (int i = N; i > 0; i--)
			System.out.print(i + " ");

		sc.close();

	}
	/**
	 * Write a program to generate the first 'N' natural numbers and print them in
	 * descending order.
	 */
}
