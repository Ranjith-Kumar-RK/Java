package com.heraizen.cj.object_creation_basics;

import java.util.Arrays;

public class ClassStudent {

	private int id;
	private String name;
	private int[] subject = { 2, 5, 6, 7, 8 };

	public ClassStudent(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("sub-marks: " + Arrays.toString(subject));
		calSum(subject);
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("------------------");
	}

	int totalMarks = 0;

	void calSum(int sum[]) {
		for (int s : sum) {
			totalMarks += s;
		}
	}

	public static void main(String[] args) {

		ClassStudent stud1 = new ClassStudent(10, "ranjith");
		stud1.display();
		ClassStudent stud2 = new ClassStudent(11, "karun");
		stud2.display();

	}

}
