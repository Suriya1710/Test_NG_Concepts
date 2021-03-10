package com.Testng_Concepts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concepts {

	@Test
	private void credentials() {

		
		
		String actual = "Starc";
		
		String expected = "Smith";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected);
		System.out.println("Verification Completed");
		
		
		
		
		
		
		
		
		
		
		
		
//
//		String actual = "Starc";
//
//		String expected = "Smith";
//
//		// assertEquals(actual, expected); // Assertion Error
//
//		// assertNotEquals(actual, expected); // passed
//
//		// assertSame(actual, expected); // Assertion Error
//
//		// assertNull(actual); // Assertion Error
//
//		// assertNotNull(expected); // Passed
//
//		int age = 19;
//
//		// assertTrue(age>=23); // Assertion Error
//
//		assertFalse(age >= 23); // Passed

	}

}
