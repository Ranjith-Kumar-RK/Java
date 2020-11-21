package com.heraizen.cj.day2.if_else_if_statement;

import java.util.Scanner;

public class FindingBiggestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter num2:");
		int num2 = sc.nextInt();
		System.out.println("Enter num3:");
		int num3 = sc.nextInt();

		int biggestNumber;
		if (num1 > num2 && num1 > num3) {
			biggestNumber = num1;
		} else if (num2 > num1 && num2 > num3) {
			biggestNumber = num2;
		} else {
			biggestNumber = num3;
		}
		System.out.println("The biggest of the 3 numbers entered is: "+biggestNumber);
		sc.close();

	}

}

/*
 * Write a program to accept 3 numbers from the user and find the biggest of
 * them.
 */
