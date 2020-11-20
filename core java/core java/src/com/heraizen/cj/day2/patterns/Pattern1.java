package com.heraizen.cj.day2.patterns;

public class Pattern1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			if (i <= 3) {
				for (int j = i; j > 0; j--) {
					System.out.print(j + " ");
				}
			} else {
				for (int j = i - 1; j > 0; j--) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

	}

}
