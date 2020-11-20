package com.heraizen.cj.object_creation_basics;

public class Student {

	private String name;
	private String address;
	private int id;
	public static int count = 0;

//	public Student(int id,String name) {
//		this(id, name);
//	}

	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void setValues(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void display() {
		System.out.println("ID of student: " + id);
		System.out.println("Name of student: " + name);
		System.out.println("Address of student: " + address);
		System.out.println("-------------------------");
	}

	{
		count++;
	}

	public static void main(String[] args) {

		Student std1 = new Student(101, "ranjith", "tiruppur");
		Student std2 = new Student(102, "karun", "madurai");
		Student std3 = new Student(103, "mohan", "tiruppur");
		Student std4 = new Student(104, "mouli", "theni");
		Student std5 = new Student(105, "navin", "palani");
		std1.display();
		std2.display();
		std3.display();
		std4.display();
		std5.display();
		System.out.println("no.of students: " + count);

	}

}
