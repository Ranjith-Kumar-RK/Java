package com.heraizen.cj.day2.patterns;

public class Pattern3 {

	public static void main(String[] args) {

		int i, j;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				if (i == 1 || i == 9 || j == 7) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
