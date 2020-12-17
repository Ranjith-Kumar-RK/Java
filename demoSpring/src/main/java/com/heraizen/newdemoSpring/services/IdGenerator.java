package com.heraizen.newdemoSpring.services;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

@Component
public class IdGenerator {
	public String newId() {
		return "ID: " + ThreadLocalRandom.current().nextLong(101, 999);
	}

}
