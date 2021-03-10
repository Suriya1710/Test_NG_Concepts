package com.Testng_Evng;

import org.testng.annotations.Test;

public class Dependency_Test {

	@Test
	private void laptopSearch() {

		System.out.println("Laptop Search");
	}
	
	@Test
	private void mobileSearch() {

		System.out.println("Mobile Search");
	}
	
	@Test
	private void earphonesSearch() {

		System.out.println("Earphones Search");
	}
	
	@Test(dependsOnMethods = "mobileSearch")
	private void offer() {

		System.out.println("offer");
	}

}
