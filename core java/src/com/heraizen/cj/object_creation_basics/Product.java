package com.heraizen.cj.object_creation_basics;

public class Product {

	private int pid;
	private String pname;
	private double price;

	public Product(int pid, String pname, double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public static Product[] allProducts() {
		Product prod0 = new Product(100, "laptop", 35000);
		Product prod1 = new Product(101, "phone", 17000);
		Product prod2 = new Product(102, "desktop", 50000);
		Product prod3 = new Product(203, "tab", 20000);
		Product prod4 = new Product(204, "printer", 25000);
		Product prod5 = new Product(303, "monitor", 50500);
		Product prod6 = new Product(292, "cpu", 25000);
		Product prod7 = new Product(343, "ups", 10000);
		Product prod8 = new Product(344, "table", 12000);
		Product prod9 = new Product(104, "mouse", 1000);

		return new Product[] { prod0, prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9 };
	}
	
	@Override
	public String toString() {
		return "pid: "+pid+" pname: "+pname+" price: "+price;
	}

	public static void main(String[] args) {

		Product[] prod = allProducts();
		
		for(Product p:prod) {
			System.out.println(p);
		}

	}

}
