package com.heraizen.cj.exception_assignment;

import java.util.Scanner;

public class Emp {

	int empId;
	String empName;
	String designation;
	double basic;
	double hra;

	
	public Emp(int empId, String empName, String designation, double basic) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.basic = basic;
	}
	
	void printDET() {
		System.out.println("print void");
	}
	void calculateHRE() {}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter employee id: ");
		int empId=sc.nextInt();
		
		System.out.print("Enter employee name: ");
		String empName=sc.next();
		
		sc.nextLine();
		System.out.print("Enter employee designation (manager/officer/clerk): ");
		String designation=sc.next();
		
		sc.nextLine();
		System.out.print("Enter employee's basic salary: ");
		double basic=sc.nextDouble();
		
		Emp employee=new Emp(empId,empName,designation,basic);
		System.out.println(empId+"; "+empName);
		employee.printDET();
		
		sc.close();
		
	}

}
