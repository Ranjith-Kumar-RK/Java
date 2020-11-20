package com.heraizen.cj.day2.patterns;

public class MultiplesPattern {
	public static void main(String[] args) {

		int n = 19, i, j;
		int s = 19;
		for (i = 1; i <= 3; i++) {
			for (j = 1; j <= 3; j++) {
				System.out.print(s + " ");
				s += n;
			}
			System.out.println();
		}

	}

}

//19 38 57
//76 95 114
//133 152 171