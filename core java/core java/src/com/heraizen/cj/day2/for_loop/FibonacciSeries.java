package com.heraizen.cj.day2.for_loop;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter value: ");
		int val = sc.nextInt();
		int a = 0, b = 1;

// Fibonacci : sum of previous 2 numbers is the 3rd number. eg: 0 1 1 2 3 5 ...

		System.out.print("Fibonacci series up to the entered number is: ");
		System.out.print(a + " " + b + " ");
		if (val > 0) {
			for (int c = 0; c < val; c++) {
				c = a + b;
				a = b;
				b = c;
				if (c <= val)
					System.out.print(c + " ");
			}
		} else {
			System.out.println("Enter valid number");
		}

		sc.close();

	}

	/**
	 * Write a program to accept a number and print the Fibonacci series up to the
	 * entered number.
	 */
}
