package com.Testng_Evng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority_Test {
	
	@Test(priority = -1)
	public static void laptopSearch() {

		System.out.println("laptop search");
	}

	@Test(priority = 1)
	public static void earphonesSearch() {

		System.out.println("earphones search");
	}

	@Test(priority = 0)
	public static void musicSearch() {

		System.out.println("Music search");
	}

	@Test
	public static void mobileSearch() {

		System.out.println("mobile search");
	}


}
