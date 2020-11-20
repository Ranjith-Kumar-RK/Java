package com.heraizen.cj.day2.for_loop;

import java.util.Scanner;

public class SumOfNNumbersCube {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int N = sc.nextInt();

		float sum = 0;
		for (int i = 2; i <= N; i++) {
			sum += (float) 1 / Math.pow(i, 3);
		}
		System.out.println("sum of series: " + sum);

		sc.close();

	}
	/**
	 * Write a program to accept a number “n” from the user; find the sum of the
	 * series 1/23+1/33+1/43……..+1/n3
	 */
}
