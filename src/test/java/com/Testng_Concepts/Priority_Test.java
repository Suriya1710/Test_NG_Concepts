package com.Testng_Concepts;

import org.testng.annotations.Test;

public class Priority_Test {

	@Test
	public static void laptopSearch() {

		System.out.println("laptop search");
	}

	@Test(priority = +1)
	public static void earphonesSearch() {

		System.out.println("Earphones search");
	}

	@Test(priority = 0)
	public static void mobileSearch() {

		System.out.println("Mobile search");
	}

	@Test(priority = -5)
	public static void musicSearch() {

		System.out.println("music search");
	}

}
