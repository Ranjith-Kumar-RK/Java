package com.heraizen.cj.day2.while_loop;

import java.util.Scanner;

public class XorOperation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char c = sc.next().charAt(0);
		sc.close();
		char ch = Character.toLowerCase(c);
		int i = 0;
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			i = 0;
		} else
			i = 1;

		switch (i) {
		case 0:
			System.out.println("The entered character is a vowel");
			break;
		case 1:
			System.out.println("The entered character is a consonant");
			break;
		}
	}

}
