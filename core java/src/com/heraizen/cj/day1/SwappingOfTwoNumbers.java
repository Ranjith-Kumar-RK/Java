package com.heraizen.cj.day1;

import java.util.Scanner;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {

		Scanner val = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int a = val.nextInt();
		System.out.println("Enter num2: ");
		int b = val.nextInt();

		System.out.println("Before swap, the values of num1=" + a + " and num2=" + b);
		int c = b;
		b = a;
		a = c;
		System.out.print("After swap, the values of num1=" + a + " and num2=" + b);
		val.close();

	}

}

/*
 * Write a program to accept two numbers from the user, swap their values and
 * display the result.
 */