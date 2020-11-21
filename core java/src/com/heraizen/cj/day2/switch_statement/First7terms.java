package com.heraizen.cj.day2.switch_statement;

public class First7terms {

	public static void main(String[] args) {

		int i = 1, sum = 0, fact = 1;
		for (i = 1; i <= 7; i++) {
			fact = 1;
			int num = i;
			while (num > 0) {
				fact *= num;
				num--;
			}
			sum += (i / fact);
		}
		System.out.println(sum);

	}

}
