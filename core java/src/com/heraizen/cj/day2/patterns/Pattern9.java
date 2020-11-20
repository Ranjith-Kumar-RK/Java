package com.heraizen.cj.day2.patterns;

public class Pattern9 {

	public static void main(String[] args) {

		int i, j, k = 1;
		for (i = 4; i > 0; i--) {
			for (j = i; j > 0; j--) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}

	}

}