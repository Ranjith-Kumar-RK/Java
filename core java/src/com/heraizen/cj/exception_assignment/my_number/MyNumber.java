package com.heraizen.cj.exception_assignment.my_number;

import java.util.Scanner;

public class MyNumber {

	private int firstNumber;
	int secondNumber;
	int a;
	static int b;
	static double result;

	public MyNumber(int x, int y) {
		a = x;
		b = y;
	}

	void add() {
		result = a + b;
	}

	void sub() {
		if (a > b)
			result = a - b;
		else
			result = b - a;
	}

	void mul() {
		result = a * b;
	}

	void div() {
		try {
			result = a / b;
			System.out.println("Division of given numbers is " + result);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		MyNumber mynumber = new MyNumber(2, 0);

		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add\t2.Sub\t3.Mul\t4.Div");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			mynumber.add();
			System.out.println("Sum of given numbers is " + result);
			break;
		case 2:
			mynumber.sub();
			System.out.println("Difference between given numbers is " + result);
			break;
		case 3:
			mynumber.mul();
			System.out.println("Product of given numbers is " + result);
			break;
		case 4:
			mynumber.div();
			break;
		default:
			System.out.println("Please choose a number between 1 to 4");
		}

		sc.close();

	}

}
