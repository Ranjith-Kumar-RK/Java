package com.heraizen.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyClassTest {

	@Test
	@DisplayName("Biggest of Two numbers - A is greater")
	void testBiggestOfTwoNumbersA() {
		MyClass obj = new MyClass();
		Assertions.assertEquals(30, obj.biggest(30, 15));
	}

	@Test
	@DisplayName("Biggest of Two numbers - B is greater")
	void testBiggestOfTwoNumbersB() {
		MyClass obj = new MyClass();
		Assertions.assertEquals(15, obj.biggest(10, 15));
	}

	@Test
	@DisplayName("Biggest of Three numbers - A is greater")
	void testBiggestOfThreeNumbersA() {
		MyClass obj = new MyClass();
		Assertions.assertEquals(20, obj.biggest(20, 10, 15));
	}

	@Test
	@DisplayName("Biggest of Three numbers - B is greater")
	void testBiggestOfThreeNumbersB() {
		MyClass obj = new MyClass();
		Assertions.assertEquals(30, obj.biggest(20, 30, 15));
	}

	@Test
	@DisplayName("Biggest of Three numbers - C is greater")
	void testBiggestOfThreeNumbersC() {
		MyClass obj = new MyClass();
		Assertions.assertEquals(50, obj.biggest(20, 10, 50));
	}

}
