package com.heraizen.cj.collections.level3.employee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeContainer {

	Set<Employee> employee = new HashSet<>();

	public void addEmployee(Employee emp) {
		employee.add(emp);
		System.out.println("Employee added successfully");
	}

	public void deleteEmployee(int empno) {

	}

	public void viewEmployee(int empno) {

	}

	public void viewEmployees() {
		if (!employee.isEmpty()) {
			for (Employee person : employee) {
//				System.out.println("Employee Id	 : " + person.empno);
//				System.out.println("Employee Name: " + person.ename);
//				System.out.println("Employee Job : " + person.job);
				System.out.println("------------------------------------");
			}
		} else {
			System.out.println("No elements are added to the Set.");
		}
	}

}
