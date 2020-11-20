package com.heraizen.cj.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class IsPresentInArray {

	/**
	 * Write a program that accepts two numbers in the range from 1 to 50 from the
	 * user. It then compares these numbers against the single dimension array of 5
	 * integer elements ranging in value from 1 to 50. The program displays the
	 * message success if the two inputted values are found in the array element.
	 * Otherwise print it as fail.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, j;
		System.out.print("Enter a number between 1 and 50: ");
		i = sc.nextInt();
		System.out.print("Enter a number between 1 and 50: ");
		j = sc.nextInt();

		int[] arr = new int[5];
		for (int k = 0; k < arr.length; k++) {
			System.out.print("Enter value " + (k + 1) + " between 1 and 50: ");
			arr[k] = sc.nextInt();
		}
		System.out.println("Array: " + Arrays.toString(arr));
		boolean isValueOneAvailable = false, isValueTwoAvailable = false;
		;
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == i) {
				isValueOneAvailable = true;
			}
			if (arr[x] == j) {
				isValueTwoAvailable = true;
			}
		}
		if (isValueOneAvailable && isValueTwoAvailable) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}

		sc.close();

	}

}
