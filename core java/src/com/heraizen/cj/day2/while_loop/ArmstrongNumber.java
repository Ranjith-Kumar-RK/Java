package com.heraizen.cj.day2.while_loop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (eg: 123): ");
		int N = sc.nextInt();
		sc.close();
		int i, A = 0;

		i = N;
		while (i > 0) {
			A += Math.pow(i % 10, 3);
			i = i / 10;
		}
		if (A == N) {
			System.out.println(N + " is an Armstrong Number");
		} else {
			System.out.println(N + " is not an Armstrong Number");
		}

	}

}
