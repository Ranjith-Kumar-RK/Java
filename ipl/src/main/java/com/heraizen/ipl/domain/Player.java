package com.heraizen.ipl.domain;

import lombok.Data;

@Data

public class Player {
	private String name;
	private double price;
	private String role;
//	private String label;
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
//	public String getLabel() {
//		return label;
//	}
//	public void setLabel(String label) {
//		this.label = label;
//	}
	
	

}
