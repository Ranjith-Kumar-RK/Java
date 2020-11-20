package com.heraizen.cj.day2.if_else_statement;

import java.util.Scanner;

public class FindingBiggerNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();

		String msg = "The bigger of the two numbers entered (" + num1 + " and " + num2 + ") is: ";
		if (num1 > num2) {
			System.out.println(msg + num1);
			return;
		}
		System.out.println(msg + num2);
		sc.close();

	}

}

/*
 * Write a program to accept two numbers from the user and determine bigger of
 * the two.
 */