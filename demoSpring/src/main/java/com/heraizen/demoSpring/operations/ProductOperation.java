package com.heraizen.demoSpring.operations;

public class ProductOperation implements MathOperations {

	@Override
	public int operations(int a, int b) {
		return a * b;
	}

}
