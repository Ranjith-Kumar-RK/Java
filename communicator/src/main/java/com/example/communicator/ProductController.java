package com.example.communicator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

import com.example.communicator.domain.NewProduct;
import com.example.communicator.dto.ProductDto;


@Configuration
//@RestController
public class ProductController {
	
//	@Autowired
//	private ModelMapper modelMapper;
//	
	
	private static List<NewProduct> list = null;

	@Bean
//	@GetMapping("/products")
	public List<ProductDto> productList() {

		ArrayList<NewProduct> list = new ArrayList<NewProduct>();

		NewProduct p1 = NewProduct.builder().pname("HP").url("https://www.hp.com/in/en/home.html").price(47000)
				.discount(3000).build();
		NewProduct p2 = NewProduct.builder().pname("Apple").url("https://www.apple.com/in/ipad/").price(78000).discount(4000)
				.build();
		NewProduct p3 = NewProduct.builder().pname("SONY").url("https://www.sony.co.in/").price(35000).discount(2000).build();
		list.add(p1);
		list.add(p2);
		list.add(p3);
//		List<ProductDto> relist = Arrays.asList(modelMapper.map(list, ProductDto[].class));
		return null;

	}

}
