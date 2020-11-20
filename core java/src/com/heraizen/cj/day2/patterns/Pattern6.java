package com.heraizen.cj.day2.patterns;

public class Pattern6 {

	public static void main(String[] args) {

		char[] arr = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };
		int i, j, k = 0;
		for (i = 1; i <= 3; i++) {
			for (j = 1; j <= 3; j++) {
				System.out.print(arr[k] + " ");
				k++;
			}
			System.out.println();
		}
	}

}
