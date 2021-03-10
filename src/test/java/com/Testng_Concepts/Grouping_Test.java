package com.Testng_Concepts;

import org.testng.annotations.Test;

public class Grouping_Test {

	@Test(groups="Electronics")
	private void laptopSearch() {

		System.out.println("Laptop Search");
	}
	
	@Test(groups="Electronics")
	private void earphonesSearch() {

		System.out.println("Earphones Search");
	}
	
	@Test(groups="Electronics")
	private void mobileSearch() {

		System.out.println("Mobile Search");
	}
	
	@Test(groups="Books")
	private void booksSearch() {

		System.out.println("Book Search");
	}
	
	@Test(groups="Books")
	private void novelSearch() {

		System.out.println("Novel Search");
	}
	
	@Test(groups = "mobiles")
	private void samsungSearch() {

		System.out.println("Samsung Search");
	}
	
	@Test(groups = "mobiles")
	private void redmiSearch() {

		System.out.println("Redmi Search");
	}
	
	
}
