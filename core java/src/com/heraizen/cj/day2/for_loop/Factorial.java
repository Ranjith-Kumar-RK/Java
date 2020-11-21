package com.heraizen.cj.day2.for_loop;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find the factorial: ");
		int N = sc.nextInt();
		int fact = 1;

		if (N > 0) {
			for (int i = N; i > 0; i--) {
				fact *= i;
			}
			System.out.println("The factorial of " + N + " is " + fact);
		} else
			System.out.println("Enter a valid number");
		sc.close();

	}
	/**
	 * Write a program to accept a number and find its factorial.
	 */
}
