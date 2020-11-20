package com.heraizen.cj.day2.for_loop;

import java.util.Scanner;

public class GeneratingNNaturalNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of natural numbers to be generated:");
		int N = sc.nextInt();

		System.out.print("First 5 natural numbers are : ");
		for (int i = 1; i <= N; i++) {
			System.out.print(i + " ");
		}

		sc.close();

	}

	/**
	 * Write a program to generate the first 'N' natural numbers. Accept the value
	 * of 'N' from the user.
	 */

}