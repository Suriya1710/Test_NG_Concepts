package com.Testng_Concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Test {

	@Test(dataProvider = "test_Data")
	private void credentials(String username, int password) {

		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
	}
	
	@DataProvider
	private Object [][] test_Data() {
		return new Object[][] {
			
			{"abc", 12},
			{"gowtham", 1234},
			{"Ajith", 17},
			{"Karthik", 16}
			
		};

	}
	
}
