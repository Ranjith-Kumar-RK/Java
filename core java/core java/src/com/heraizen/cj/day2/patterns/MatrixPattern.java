package com.heraizen.cj.day2.patterns;

public class MatrixPattern {
	public static void main(String[] args) {

		int c = 1;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}

	}

//	1 2 3
//	4 5 6
//	7 8 9
}
