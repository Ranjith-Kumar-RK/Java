package com.heraizen.cj.tasks;

import java.util.Scanner;
import java.util.Arrays;

public class FindingUpperAndLowerBoundValuesInArray {

	/**
	 * Write a program to accept N value and create the array size N. Find the
	 * biggest and the smallest elements in the array.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter value " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int max = arr[0], min = arr[0], j;
		for (j = 0; j < arr.length; j++) {
			if (arr[j] > max) {
				max = arr[j];
			}
			if (arr[j] < min) {
				min = arr[j];
			}
		}
		System.out.println("Smallest value in the array is : " + min);
		System.out.println("Biggest value in the array is : " + max);
		sc.close();
	}

}
