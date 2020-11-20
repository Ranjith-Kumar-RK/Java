package com.heraizen.cj.day2.for_loop;

import java.util.Scanner;

public class MultiplesUpto10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int N = sc.nextInt();

		if (N > 0) {
			System.out.println("Multiplication table for " + N + " is :");

			for (int i = 1; i <= 10; i++) {
				System.out.println(N + " * " + i + " = " + (N * i));
			}
		}

		sc.close();

	}
	/**
	 * Write a program to accept a number from the user and print its multiplication
	 * table (upto “times 10”).
	 */
}
