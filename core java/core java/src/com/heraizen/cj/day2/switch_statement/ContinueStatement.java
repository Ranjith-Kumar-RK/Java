package com.heraizen.cj.day2.switch_statement;

public class ContinueStatement {

	public static void main(String[] args) {

		int i, j;
		for (i = 1; i <= 3; i++) {
			for (j = 1; j <= 3; j++) {
				if (i == j) {
					continue;
				}
				System.out.println(i + " " + j);
			}
		}

	}

}
