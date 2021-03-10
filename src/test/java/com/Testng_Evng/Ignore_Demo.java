package com.Testng_Evng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Demo {

	@BeforeMethod
	public static void login() {

		System.out.println("login");
	}
	
	@Test
	public static void laptopSearch() {

		System.out.println("laptop search");
	}

	@Test(enabled = false)
	public static void earphonesSearch() {

		System.out.println("earphones search");
	}

	@Ignore
	@Test
	public static void booksSearch() {

		System.out.println("Books search");
	}

	@Test
	public static void mobileSearch() {

		System.out.println("mobile search");
	}

	@AfterMethod
	public static void logout() {

		System.out.println("Logout");
	}
	
	
}
