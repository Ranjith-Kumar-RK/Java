package com.heraizen.cj.day1;

import java.util.Scanner;

public class CalculatingYearlySalary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter employee ID: ");
		int id = input.nextInt();
		System.out.println("Enter employee name: ");
		String name = input.next();
		System.out.println("Enter employee salary: ");
		int salary = input.nextInt();

		int yearlySalary = salary * 12;
		String firstLetter = name.substring(0, 1);
		String remainingLetters = name.substring(1, name.length());
		firstLetter = firstLetter.toUpperCase();
		name = firstLetter + remainingLetters;

		System.out.println("Hi " + name + "! Your employee id is " + id + ", monthly salary is Rs " + salary
				+ " and yearly salary is Rs " + yearlySalary + ".");
		input.close();

	}

}

/*
 * Write a program to accept the following details of an employee: empno, name
 * and monthly salary; calculate the yearly salary and display the result.
 */