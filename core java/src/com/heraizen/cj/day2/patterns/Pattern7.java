package com.heraizen.cj.day2.patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {

		int i, j, min, max, sum = 0;
		int[][] arr = new int[3][3];

		// receiving element from user for matrix & calculating sum of elements in
		// matrix
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("Enter value : ");
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
			}
		}
		sc.close();

		// finding biggest and smallest elements in matrix
		min = arr[0][0];
		max = arr[0][0];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}

		System.out.println("\nGiven matrix:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nSum of elements in matrix: " + sum);
		System.out.println("Biggest element in matrix: " + max);
		System.out.println("Smallest element in matrix: " + min);

	}

}
