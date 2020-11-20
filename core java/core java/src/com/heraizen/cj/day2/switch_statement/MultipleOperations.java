package com.heraizen.cj.day2.switch_statement;

import java.util.Scanner;

public class MultipleOperations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st operand num1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd operand num2: ");
		int num2 = sc.nextInt();

		System.out.println("\n1. add 2. mul 3. div 4. mod");
		System.out.print("Choose one to perform operation: ");
		int operation = sc.nextInt();

		switch (operation) {
		case 1:
			System.out.println("Sum of given two numbers is " + (num1 + num2));
			break;
		case 2:
			System.out.println("Product of given two numbers is " + (num1 * num2));
			break;
		case 3:
			System.out.println("Division of given two numbers is " + (num1 / num2));
			break;
		case 4:
			System.out.println("Modulus of given two numbers is " + (num1 % num2));
			break;
		}

	}

}
