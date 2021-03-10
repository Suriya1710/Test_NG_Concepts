package com.Testng_Concepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@BeforeMethod
	public static void login() {
		System.out.println("login");
	}

	@Test
	public static void laptopSearch() {

		System.out.println("Laptop search");
	}

	@Test
	public static void mobileSearch() {

		System.out.println("Mobile search");
	}

	@Ignore
	@Test
	public static void earphonesSearch() {

		System.out.println("Earphones search");
	}

	@Test(enabled = false)
	public static void bookSearch() {

		System.out.println("Book search");
	}

	@AfterMethod
	public static void logout() {
		System.out.println("Logout");
	}

}
