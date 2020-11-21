package com.heraizen.cj.object_creation_basics;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {

		// GCD
		System.out.println("<-------- GCD -------->");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value 1: ");
		int a = sc.nextInt();
		System.out.print("Enter value 2: ");
		int b = sc.nextInt();
		int GCD = gcd1(a, b);
		System.out.println("GCD of given numbers is: " + GCD);

		// Fibinacci
		System.out.println("\n<-------- Fibonacci -------->");

		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter number: ");
		int N = sc1.nextInt();
		int a1 = 0, b1 = 1, temp = 0;
		System.out.print(a1 + " " + b1 + " ");
		int F = N;
		while (F > 0) {
			temp = a1 + b1;
			a1 = b1;
			b1 = temp;
			if (temp <= F) {
				System.out.print(temp + " ");
			} else {
				break;
			}
		}
		sc.close();
		sc1.close();

		// Sum of N natural numbers
		System.out.println("\n\n<-------- sum of N natural numbers -------->");
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
		}
		System.out.println("The sum of N natural numbers is: " + sum);

	}

	public static int gcd1(int a, int b) {
		if (b != 0) {

			return gcd1(b, a % b);
		} else

		{
			return a;
		}
	}
}
