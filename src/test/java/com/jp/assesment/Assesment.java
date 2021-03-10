package com.jp.assesment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assesment {

	private static WebDriver driver;
	//XcelParserTestNGLogin login1 = new XcelParserTestNGLogin();
	Object[][] data;
	
	
	@Test(dataProvider = "user_Details")
	private void credentials(String username, String Password) {

	}
	
	@DataProvider
	private Object[][] user_Details() throws Throwable {
		

		FileInputStream fis = new FileInputStream("C:\\Eclipse\\Demo\\Data_Driven\\Test_Cases.xlsx");
		String sheetName = "Login";
	//	login1.loadFromSpreadsheet(fis,sheetName);
	//	return login1.getData();
		return data;
		
	}

}
