package com.heraizen.cj.day2.patterns;

public class Pattern8 {
	/**
	 * invalid output refer 39 in jsl
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int k = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (k == 6) {
					k = 1;
				}
				System.out.print(k + " ");
				k++;
			}
			k--;
			System.out.println();
		}

	}

}
