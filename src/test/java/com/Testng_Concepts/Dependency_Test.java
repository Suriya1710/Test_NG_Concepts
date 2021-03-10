package com.Testng_Concepts;

import org.testng.annotations.Test;

public class Dependency_Test {

	@Test
	private void laptopSearch() {

		System.out.println("laptop search");
	}

	@Test
	private void mobileSearch() {

		System.out.println("mobile search");
	}

	@Test
	private void samsungSearch() {

		System.out.println("Samsung Products");
	}

	@Test(dependsOnMethods = "mobileSearch")
	private void offer() {

		System.out.println("Offer");
	}

}
