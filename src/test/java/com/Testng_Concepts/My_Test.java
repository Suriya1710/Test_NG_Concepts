package com.Testng_Concepts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class My_Test {

	@Test
	private void username() {

		String actual = "Starc";

		String expected = "smith";

		assertEquals(actual, expected);

	}

	@Test
	private void password() {

		String actual = "Starc123";

		String expected = "Starc567";

		assertEquals(actual, expected);

	}

}
