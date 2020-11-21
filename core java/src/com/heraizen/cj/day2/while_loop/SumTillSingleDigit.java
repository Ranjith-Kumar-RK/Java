package com.heraizen.cj.day2.while_loop;

import java.util.Scanner;

public class SumTillSingleDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int N = sc.nextInt();
		sc.close();
		int temp, s = 0;

		/**
		 * Write a program to accept a number from the user and calculate the sum of
		 * digits of the number; repeat the operation till the sum gets to be a single
		 * digit number.
		 */
		temp = N;
		while (temp > 0 || s > 9) {
			if (temp == 0) {
				temp = s;
				s = 0;
			}
			s += temp % 10;
			temp = temp / 10;
		}
		System.out.println("Single digit sum is: " + s);

		/**
		 * Write a program to accept a number from the user and count the number of
		 * prime digits.
		 */
		int i, j, c = 0, k = 0;
		temp = N;
		while (temp > 0) {
			i = temp % 10;
			c = 0;
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 1) {
				k++;
			}
			temp = temp / 10;
		}
		System.out.println("Number of prime digits in the given number is " + k);

		/**
		 * Write a program to accept a number and find the factorial of the number
		 * (using while loop).
		 */
		temp = N;
		int fact = 1;
		while (temp > 0) {
			fact *= temp;
			temp--;
		}
		System.out.println("The factorial of " + N + " is " + fact);

	}

}
