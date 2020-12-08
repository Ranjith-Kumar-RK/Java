package com.heraizen.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckClassTest {

	@Test
	@DisplayName("negative input")
	void convertNegToPos() {
		CheckClass obj = new CheckClass();
		Assertions.assertEquals(5, obj.conversion(-5));
	}

	@Test
	@DisplayName("positive input and zero")
	void convertInput() {
		CheckClass obj = new CheckClass();
		Assertions.assertEquals(4, obj.conversion(4));
	}

}
