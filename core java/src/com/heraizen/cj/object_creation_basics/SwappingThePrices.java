package com.heraizen.cj.object_creation_basics;

public class SwappingThePrices {

	private int id;
	private String name;
	private double price;

	public SwappingThePrices(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void setValues(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void swap(SwappingThePrices laptop, SwappingThePrices desktop) {
		double temp = laptop.price;
		laptop.price = desktop.price;
		desktop.price = temp;
	}

	public void display(SwappingThePrices laptop, SwappingThePrices desktop) {
		System.out.println(laptop.id + " " + laptop.name + " " + laptop.price);
		System.out.println(desktop.id + " " + desktop.name + " " + desktop.price);
	}

	public static void main(String[] args) {

		SwappingThePrices laptop = new SwappingThePrices(100, "sony", 35000);
		SwappingThePrices desktop = new SwappingThePrices(101, "lg", 85500);
		System.out.println("\n----- Before swapping -----");
		laptop.display(laptop, desktop);
		swap(laptop, desktop);
		System.out.println("\n----- After swapping -----");
		laptop.display(laptop, desktop);

	}

}
