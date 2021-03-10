package com.Testng_Evng;

import org.testng.annotations.Test;

public class TimeOut_Demo {

	@Test(timeOut = 2000)
	public static void laptopSearch() throws Throwable {

		System.out.println("Laptop Page");
		Thread.sleep(1000);
		System.out.println("Laptop search");

	}

}
