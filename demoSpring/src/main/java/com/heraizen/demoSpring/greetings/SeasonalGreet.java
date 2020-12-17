package com.heraizen.demoSpring.greetings;

public class SeasonalGreet implements Greetings {

	@Override
	public String greet(String value) {
		return String.format("Hello %s, Happy Morning", value);
	}

}
