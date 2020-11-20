package com.heraizen.cj.tasks;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Matrix {

	/**
	 * Write a program that accepts M x N matrix and 1. Find the sum of elements in
	 * the matrix 2. Biggest element in the matrix 3. Diagonal sum of the matrix 4.
	 * Transpose of the given matrix
	 */

	public static void main(String[] args) {

		int M, N, sum = 0, i, j;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		M = sc.nextInt();
		System.out.print("Enter no. of columns: ");
		N = sc.nextInt();
		sc.close();

		int[][] matrix = new int[M][N];

		// auto generating MxN matrix
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				matrix[i][j] = ThreadLocalRandom.current().nextInt(1, 10);
			}
		}
		System.out.println("given matrix:");
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// sum of elements in the matrix
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				sum += matrix[i][j];
			}
		}
		System.out.println("Sum of elements: " + sum);

		// biggest element of matrix
		int max = 1;
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		System.out.println("Biggest element: " + max);

		// diagonal sum of matrix
		int diagonalSum = 0;
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				if (i == j) {
					diagonalSum += matrix[i][j];
				}
			}
		}
		System.out.println("Diagonal sum of matrix: " + diagonalSum);

		// transpose of the given matrix
		int[][] transposeMatrix = new int[N][M];
		for (i = 0; i < N; i++) {
			for (j = 0; j <M; j++) {
				transposeMatrix[i][j] = matrix[j][i];
			}
		}
		System.out.println("Transpose of given matrix:");
		for (i = 0; i < N; i++) {
			for (j = 0; j < M; j++) {
				System.out.print(transposeMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}
}
