package com.heraizen.cj.day2.if_else_statement;

import java.util.Scanner;

public class DifferenceBetweenTwoNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();

		int output = num1 - num2;
		if (output < 0) {
			output *= -1;
		}
		System.out.println("The result (difference) is: " + output);
		sc.close();

	}

}

/*
 * Write a program to accept two numbers num1 and num2; when one is subtracted
 * from the other, the result should always be a positive number.
 */