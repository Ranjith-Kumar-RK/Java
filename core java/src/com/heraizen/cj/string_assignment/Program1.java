package com.heraizen.cj.string_assignment;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		sc.close();

		System.out.println("length of given string: " + str.length());
		System.out.println("converting into uppercase: " + str.toUpperCase());
		System.out.println("converting into lowercase: " + str.toLowerCase());
		if (new StringBuilder(str.toLowerCase()).reverse().toString().equals(str.toLowerCase())) {
			System.out.println("The given string is a Palindrome.");
		} else {
			System.out.println("The given string is not a Palindrome.");
		}

	}

}
