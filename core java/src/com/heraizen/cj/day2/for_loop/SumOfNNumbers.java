package com.heraizen.cj.day2.for_loop;

import java.util.Scanner;

public class SumOfNNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int N = sc.nextInt();
		int sum = 0;

		System.out.print("The series of n numbers:");
		for (int i = 1; i <= N; i++) {
			int value = (2 * i) - 1;
			if (value <= N) {
				sum += value;
				System.out.print(value + " ");
			}
		}
		System.out.println("\nSum of n numbers: " + sum);

		sc.close();
	}
	/**
	 * Write a program to accept a number “n” from the user; then display the series
	 * 1,3,5,7,9,…,n and find the sum of the numbers in this series.
	 */
}
