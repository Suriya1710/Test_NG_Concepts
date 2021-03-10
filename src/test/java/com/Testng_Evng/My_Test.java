package com.Testng_Evng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class My_Test {

	@Test(retryAnalyzer = Retry_Analyser.class)
	private void validation() {

		String actual = "Sherlock";

		String expected = "Watson";

		assertEquals(actual, expected);

	}

	@Test
	private void validation2() {

		String actual = "Sherlock";

		String expected = "Watson";

		assertEquals(actual, expected);

	}

}
