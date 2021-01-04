package com.heraizen.springmvc.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

	private String pid;
	private String pname;
	private double price;

}
