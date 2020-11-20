package com.heraizen.cj.day2.patterns;

public class RightAngleIncrementValue {

	public static void main(String[] args) {

		int c = 1;
		for (int i = 1; i <= 4; i++) {
			if (i == 3) {
				for (int j = 1; j <= i + 1; j++) {
					System.out.print(c + " ");
					c++;
				}
			} else {
				for (int j = 1; j <= i; j++) {
					System.out.print(c + " ");
					c++;
				}
			}
			System.out.println();
		}

	}

//1
//2 3
//4 5 6 7
//8 9 10 11

}
