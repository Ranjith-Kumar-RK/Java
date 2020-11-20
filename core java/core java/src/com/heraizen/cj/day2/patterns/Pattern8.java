package com.heraizen.cj.day2.patterns;

public class Pattern8 {
	/**
	 * invalid output refer 39 in jsl
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int i, j;
		int k;
		k = 1;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print(k + " ");
				k++;
				if (k > 5) {
					k = 1;
				}
			}
			System.out.println(k);
		}

	}

}
