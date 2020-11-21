package com.heraizen.cj.object_creation_basics;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N = sc.nextInt();
		sc.close();

		int fact = 1;
		while (N > 0) {
			fact *= N;
			N--;
		}

		System.out.println("The factorial of given number is: " + fact);

	}

}
