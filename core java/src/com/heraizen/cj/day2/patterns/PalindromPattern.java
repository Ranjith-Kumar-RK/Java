package com.heraizen.cj.day2.patterns;

public class PalindromPattern {
	public static void main(String[] args) {

		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (j = i - 1; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}

//1
//1 2 1
//1 2 3 2 1
//1 2 3 4 3 2 1
//1 2 3 4 5 4 3 2 1
