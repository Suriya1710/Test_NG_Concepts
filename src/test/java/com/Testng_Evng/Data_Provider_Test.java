package com.Testng_Evng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Test {
	
	@Test(dataProvider = "test_Datas")
	private void credentials(String username, int password) {

		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
	}
	
	@DataProvider
	private Object[][] test_Datas() {

		return new Object[][] {
			
			{"Smith", 12},
			{"Starc", 16},
			{"Wade", 13}
			
		};
		
	}
}
