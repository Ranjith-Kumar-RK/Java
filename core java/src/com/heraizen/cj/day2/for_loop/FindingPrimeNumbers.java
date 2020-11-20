package com.heraizen.cj.day2.for_loop;

import java.util.Scanner;

public class FindingPrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number:");
		int N = sc.nextInt();

		sc.close();
		if (N > 1) {
			for (int i = 2; i < N; i++) {
				if (N % i == 0) {
					System.out.println("The entered number " + N + " is not a prime number");
					return;
				}
			}
		} else if (N < 1) {
			System.out.println("Enter valid number");
			return;
		}
		System.out.println("The entered number " + N + " is a prime number");


	}
	/**
	 * Write a program to accept a number and determine whether it is a prime number
	 * or not.
	 */
}
