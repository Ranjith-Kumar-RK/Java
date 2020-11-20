package com.heraizen.cj.day2.while_loop;

import java.util.Scanner;

public class CountSumAndReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number (eg: 14567): ");
		int N = sc.nextInt();
		int count = 0, sum = 0, temp;
		String reverse = "";
		sc.close();

		temp = N;
		while (temp > 0) {
			sum += temp % 10;
			reverse += temp % 10;
			temp = temp / 10;
			count++;
		}
		System.out.println("The number of digits in the entered number is " + count);
		System.out.println("The sum of digits of the entered number is " + sum);
		System.out.println("Reverse pf the entered number is " + Integer.parseInt(reverse));

	}

}
