package com.heraizen.cj.day2.if_else_statement;

import java.util.Scanner;

public class FindingEvenOrOdd {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		String message = "The entered number " + num + " is ";
		if (num % 2 == 0) {
			System.out.println(message + "even.");
			return;
		}
		System.out.println(message + "odd.");
		sc.close();

	}

}

/*
 * Write a program to accept a number from the user and determine whether it is
 * even or odd.
 */