package com.heraizen.cj.tasks;

import java.util.Arrays;

public class OverridingArrayValues {

	/**
	 * Write a program that allows you to create an integer array of 18 elements
	 * with the following values: int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,2,0,0,0,}. The
	 * program computes the sum of element 0 to 14 and stores it at element 15,
	 * computes the average and stores it at element 16 and identifies the smallest
	 * value from the array and stores it at element 17.
	 */

	public static void main(String[] args) {

		int[] arr = new int[] { 3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 2, 0, 0, 0, };
		System.out.println("given array: " + Arrays.toString(arr));
		int sum = 0, i, min;

		min = arr[0];
		for (i = 0; i < 14; i++) {
			sum += arr[i];
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		arr[14] = sum;
		arr[15] = sum / 14;
		arr[16] = min;
		System.out.println("modified array: " + Arrays.toString(arr));

	}

}
