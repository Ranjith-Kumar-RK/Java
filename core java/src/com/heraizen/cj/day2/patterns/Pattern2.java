package com.heraizen.cj.day2.patterns;

public class Pattern2 {

	public static void main(String[] args) {

		int i, j, k;
		for (i = 1; i <= 3; i++) {
			for (j = 1; j <= 3; j++) {
				if (i == j)
					k = 19;
				else
					k = 0;
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}
