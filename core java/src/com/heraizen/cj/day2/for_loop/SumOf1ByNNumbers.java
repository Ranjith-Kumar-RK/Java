package com.heraizen.cj.day2.for_loop;

import java.util.Scanner;

public class SumOf1ByNNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int N = sc.nextInt();

		float sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += (float) 1 / i;
		}
		System.out.println("sum of series: " + sum);

		sc.close();

	}
	/**
	 * Write a program to accept a number “n” from the user; then display the sum of
	 * the series 1+1/2+1/3+……….+1/n.
	 */
}
