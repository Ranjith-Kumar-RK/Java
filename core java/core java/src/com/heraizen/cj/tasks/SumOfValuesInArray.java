package com.heraizen.cj.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfValuesInArray {

	/**
	 * Write a program to accept N value and create the array size N. Find the sum
	 * of elements in the array.
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// to get the size of array
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		int[] array = new int[n];

		// getting array values
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter value " + (i + 1) + ": ");
			array[i] = sc.nextInt();
		}

		// sum of values in array
		int sum = 0;
		for (int ele : array) {
			sum += ele;
		}
		System.out.println("Sum of elements in array: " + sum);
		System.out.println(Arrays.toString(array));

		sc.close();

	}

}
