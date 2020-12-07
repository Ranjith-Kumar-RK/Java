package com.heraizen.ipl.domain;

import lombok.Data;

@Data

public class Players {
	private String name;
	private String role;
	private double price;

	@Override
	public String toString() {
		return "name=" + name + ", role=" + role + ", price=" + price;

	}

}
