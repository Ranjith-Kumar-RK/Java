package com.heraizen.cj.day2.while_loop;

import java.util.Scanner;

public class IncrementByOneDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N = sc.nextInt();
		int s = 0, i = 1, t;
		while (N > 0) {
			t = N % 10;
			s += (t + 1) % 10 * i;
			i *= 10;
			N = N / 10;
		}
		System.out.println(s);
		sc.close();

	}

}
