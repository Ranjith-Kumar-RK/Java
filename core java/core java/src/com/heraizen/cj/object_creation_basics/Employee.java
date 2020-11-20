package com.heraizen.cj.object_creation_basics;

public class Employee {

	private int id;
	private String name;
	private float sal;

	public Employee(int id, String name) {
		this(id, name, 20000);
	}

	public Employee(int id, String name, float sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public void setValues(int id, String name, float sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public void display() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee name: " + name);
		System.out.println("Employee salary: " + sal);
		System.out.println("-------------------------------");
	}

	public static void main(String[] args) {

		Employee emp = new Employee(101, "ranjith", 23000);
		emp.display();
		Employee emp2 = new Employee(104, "karun");
		emp2.display();

	}

}
