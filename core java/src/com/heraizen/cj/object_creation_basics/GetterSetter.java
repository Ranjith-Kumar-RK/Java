package com.heraizen.cj.object_creation_basics;

public class GetterSetter {

	private int eId;
	private String eName;
	private double eSal;

	public int getId() {
		return eId;
	}

	public String getName() {
		return eName;
	}

	public double getSalary() {
		return eSal;
	}

	public void setValues(int eId, String eName, double eSal) {
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
	}

	public void display() {
		System.out.println("id    : " + getId());
		System.out.println("name  : " + getName());
		System.out.println("salary: " + getSalary());
		System.out.println("----------------------");
	}

	public static void main(String[] args) {

		GetterSetter emp = new GetterSetter();
		emp.setValues(101, "ranjith", 18000);
		emp.display();
		GetterSetter emp1 = new GetterSetter();
		emp1.setValues(121, "shankar", 18136);
		emp1.display();

	}

}
