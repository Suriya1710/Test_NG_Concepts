package com.Testng_Concepts;

import org.testng.annotations.Test;

public class Timeout_Test {

	
	@Test(timeOut = 2000)
	public static void navigatePage() throws Throwable {

		System.out.println("ready to navigate");
		Thread.sleep(1000);
		System.out.println("Navigation completed");
	}
	
	
}
