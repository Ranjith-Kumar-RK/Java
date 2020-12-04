package com.heraizen.cj.collections.level2.primes;

import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N = sc.nextInt();

		DisplayPrimes.generatePrimes(N);

		sc.close();
	}

}
