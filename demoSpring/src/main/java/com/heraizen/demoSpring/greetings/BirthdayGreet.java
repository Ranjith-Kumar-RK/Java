package com.heraizen.demoSpring.greetings;

public class BirthdayGreet implements Greetings {

	@Override
	public String greet(String value) {
		return String.format("Hello %s, Happy Birthday to You", value);
	}

}
