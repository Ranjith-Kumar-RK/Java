package com.heraizen.cj.day2.for_loop;

import java.util.Scanner;

public class PrimeNumbersBetweenARange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the lower bound value: ");
		int x = sc.nextInt();
		System.out.print("Enter the higher bound value: ");
		int y = sc.nextInt();

		if (x > y)
			System.out.println("Enter a valid value");
		else {
			System.out.print("The prime numbers between " + x + " and " + y + " are: ");
			for (int i = x; i <= y; i++) {
				if (i > 1) {
					int count = 0;
					for (int j = 2; j < i; j++) {
						if (i % j == 0) {
							count += 1;
						}
					}
					if (count == 0)
						System.out.print(i + " ");
				}
			}
		}

		sc.close();

	}
	/**
	 * Write a program to accept the lower bound number and the upper bound number
	 * from the user and print the prime numbers between them.
	 */

}
