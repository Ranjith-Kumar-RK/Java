package com.heraizen.cj.day2.patterns;

public class Pattern4 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 1, 1, 1 }, { 1, 0, 0, 1 }, { 1, 1, 1, 1 }, { 1, 0, 0, 1 }, { 1, 0, 0, 1 } };
		for (int i[] : arr) {
			for (int j : i) {
				if (j == 1) {
					System.out.print("@ ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}