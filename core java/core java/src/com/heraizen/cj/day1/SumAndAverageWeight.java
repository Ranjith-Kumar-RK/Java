package com.heraizen.cj.day1;

import java.util.Scanner;

public class SumAndAverageWeight {
	public static void main(String[] args) {

		Scanner weight = new Scanner(System.in);
		System.out.println("Enter the weight of 1st person: ");
		float a = weight.nextFloat();
		System.out.println("Enter the weight of 2nd person: ");
		float b = weight.nextFloat();
		System.out.println("Enter the weight of 3rd person: ");
		float c = weight.nextFloat();

		float totalWeightOfThreePersons = a + b + c;
		float averageWeightOfThreePersons = totalWeightOfThreePersons / 3;

		System.out.println("The sum of weight of the 3 persons is " + totalWeightOfThreePersons
				+ " Kgs and the average weight is " + averageWeightOfThreePersons + " Kgs");
		weight.close();
	}

}

/*
 * Write a program to accept the weight of 3 persons, calculate the total
 * weight, determine the average weight and display these details.
 */