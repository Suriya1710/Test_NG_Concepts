package com.Testng_Evng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	public static void setProperty() {
		System.out.println("Set property");
	}

	@BeforeTest
	public static void browserLaunch() {

		System.out.println("Browser launch");
	}

	@BeforeClass
	public static void url() {
		System.out.println("Url");
	}

	@BeforeMethod
	public static void login() {

		System.out.println("Login");
	}

	@Test
	public static void laptopSearch() {

		System.out.println("Laptop search");

	}

	@Test
	public static void mobileSearch() {

		System.out.println("Mobile search");
	}

	@AfterMethod
	public static void logout() {

		System.out.println("Logout");
	}
	
	@AfterClass
	public static void verifyHomePage() {

		System.out.println("verify Home page");
	}
	
	@AfterTest
	public static void close() {

		System.out.println("close");
	}
	
	@AfterSuite
	public static void deleteAllCookies() {

		System.out.println("Delete All cookies");
	}
	
	

}
