package com.heraizen.junit5;

public class MyClass {

	public int biggest(int a, int b) {
		return a > b ? a : b;
	}

	public int biggest(int a, int b, int c) {
		return a > b && a > c ? a : b > c ? b : c;
	}

}
