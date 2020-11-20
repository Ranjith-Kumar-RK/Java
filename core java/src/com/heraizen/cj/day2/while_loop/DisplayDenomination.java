package com.heraizen.cj.day2.while_loop;

import java.util.Scanner;

public class DisplayDenomination {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N = sc.nextInt();
		int l = Integer.toString(N).length();
		char[] arr = Integer.toString(N).toCharArray();
		for (char i : arr) {
			int j = Integer.parseInt(String.valueOf(i));
			int pow = (int) Math.pow(10, l - 1);
			System.out.println(j + "*" + pow + "=" + j * pow);
			l--;
		}

		sc.close();
	}

}
