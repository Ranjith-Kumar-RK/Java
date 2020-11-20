package com.heraizen.cj.day2.if_else_if_statement;

import java.util.Scanner;

public class SumAverageAndGrade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the marks scored in 1st subject:");
		int sub1 = sc.nextInt();
		System.out.println("Enter the marks scored in 2nd subject:");
		int sub2 = sc.nextInt();
		System.out.println("Enter the marks scored in 3rd subject:");
		int sub3 = sc.nextInt();

		int total = sub1 + sub2 + sub3;
		int average = total / 3;

		if (average < 35)
			System.out.println("Total marks: " + total + "\nAverage is: " + average + "\nGrade: \"C\"");
		else if (average >= 35 && average < 60)
			System.out.println("Total marks: " + total + "\nAverage is: " + average + "\nGrade: \"B\"");
		else
			System.out.println("Total marks: " + total + "\nAverage is: " + average + "\nGrade: \"A\"");

		sc.close();

	}

}

/*
 * Write a program to accept the marks scored in three subjects; determine the
 * sum and average of the entered marks. Grade is awarded based on following
 * criteria.
 */
