package com.Testng_Evng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Invocation_Test {

	@Test(priority = -1)
	public static void laptopSearch() {

		System.out.println("laptop search");
	}

	@Test(invocationCount = 3)
	public static void refresh() {

		System.out.println("refresh");
	}
	
	@Test(priority =1)
	public static void mobileSearch() {

		System.out.println("mobile search");
	}

	

}
