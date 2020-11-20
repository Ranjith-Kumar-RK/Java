package com.heraizen.cj.exception_assignment;

import java.util.Scanner;

public class Employee {
	int empNumber;
	String name;
	float exp;

	public void Employee(int id, String empname, float empexp) {
		this.empNumber = id;
		this.name = empname;
		this.exp = empexp;
		System.out.println(empNumber + " " + name + " " + empexp + " Experience");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee id:  ");
		int empNum = sc.nextInt();

		System.out.print("Enter Employee Name: ");
		String empName = sc.next();

		System.out.print("Enter experience: ");
		float experince = sc.nextFloat();

		try {
			if (experince > 2.5 && experince < 3.6) {
				Employee emp = new Employee();
				emp.Employee(empNum, empName, experince);
			} else {
				throw new IllegalArgumentException(
						"Experience of employee must be in the range of 2.5 years to 3.6 years");
			}
		} finally {
			sc.close();
		}
	}
}
