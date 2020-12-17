package com.heraizen.newdemoSpring.services;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.heraizen.newdemoSpring.services" })

public class DriverClass {
	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(DriverClass.class)) {
			IdGenerator idGen = context.getBean(IdGenerator.class);
			System.out.println(idGen.newId());
		}
	}
}
