package com.heraizen.junit5;

public class CheckClass {

	public int conversion(int a) {
		int c;
		if (a < 0) {
			c = a * (-1);
		} else {
			c = a;
		}
		return c;
	}

}
