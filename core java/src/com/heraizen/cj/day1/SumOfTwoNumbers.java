package com.heraizen.cj.day1;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value 1: ");
		int a = sc.nextInt();
		System.out.println("Enter value 2: ");
		int b = sc.nextInt();
		int ans = a + b;
		System.out.println("Sum of " + a + " and " + b + " is " + ans);
		sc.close();
	}

}

/*
 * Write a program to accept two numbers from the user, calculate the sum and
 * display the same.
 */