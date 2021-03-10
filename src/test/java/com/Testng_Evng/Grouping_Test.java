package com.Testng_Evng;

import org.testng.annotations.Test;

public class Grouping_Test {
	
	@Test(groups = "Electronics")
	private void laptopSearch() {

		System.out.println("Laptop Search");
	}
	
	@Test(groups = "Electronics")
	private void mobileSearch() {

		System.out.println("Mobile Search");
	}
	
	@Test(groups = "Electronics")
	private void earphonesSearch() {

		System.out.println("Earphones Search");
	}
	
	@Test(groups = "Books")
	private void booksSearch() {

		System.out.println("booksSearch");
	}
	
	@Test(groups = "Books")
	private void novelSearch() {

		System.out.println("Novel Search");
	}
	
	
	@Test(groups = "Mobiles")
	private void redmiMobile() {

		System.out.println("Redmi mobile");
	}
	
	@Test(groups = "Mobiles")
	private void samsungMobile() {

		System.out.println("Samsung mobile");
	}
	


}
