package com.Testng_Concepts;

import org.testng.annotations.Test;

public class Invocation_Test {
	
	
	@Test
	public static void browserLaunch() {

		System.out.println("browser launch");
	}
	
	@Test(invocationCount = 3)
	public static void refresh() {

		System.out.println("refresh");
	}
	
	
	@Test
	public static void url() {

		System.out.println("url");
	}

}
