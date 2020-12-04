package com.heraizen.cj.collections.level2.primes;

import java.util.Vector;

public class DisplayPrimes {

	public static void generatePrimes(int num) {
		Vector<Integer> object = new Vector<>();

		int i = 2;
		while (object.size() != num) {
			int c = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 1) {
				object.add(i);
			}
			i++;
		}

		showPrimes(object);
	}

	public static void showPrimes(Vector<Integer> vector) {
		vector.stream().forEach(System.out::println);
	}

}
