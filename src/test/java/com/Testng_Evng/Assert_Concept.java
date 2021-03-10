package com.Testng_Evng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {

	@Test
	private void credentials() {

		String actual = "Starc";
		
		String expected = "Smith";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actual, expected);
		
		System.out.println("Validation Completed");
		
		
		
		
		
		
		
		
		
		
		
		
//		String actual = null;
//
//		String expected = "Smith";
//
//		// assertEquals(actual, expected); // assertion failed
//
//		// assertNotEquals(actual, expected); // passed
//
//		// assertSame(actual, expected); // assertion failed
//
//		// assertNull(actual); // failed
//
//		// assertNotNull(actual); // Passed
//
//		int age = 10;
//
//		// assertTrue(age>=17); // Assertion Failed
//
//		assertFalse(age >= 17); // passed

		
		
		
		
		
		
		
		
		
	}

}
