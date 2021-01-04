package com.heraizen.springmvc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.heraizen.springmvc.domain.Product;

@Service
public class ProductService {

	private List<Product> products;
	private Map<String, Product> productMap;

	public ProductService() {
		products = new ArrayList<>();
		products.add(Product.builder().pid("2783").pname("Laptop").price(35000).build());
		products.add(Product.builder().pid("8421").pname("Mobile").price(18000).build());
		products.add(Product.builder().pid("7734").pname("Hard disk").price(5000).build());
		products.add(Product.builder().pid("4355").pname("Desktops").price(55000).build());
		productMap = products.stream().collect(Collectors.toMap(Product::getPid, p -> p));
	}

	public List<Product> getAllProducts() {
		return products;
	}

	public Product getProductById(String pid) {
		return productMap.get(pid);
	}

}
