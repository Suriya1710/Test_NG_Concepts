package com.Testng_Evng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	@Test
	@Parameters({"username","password"})
private void credentials(@Optional("Starc")String username, int password) {

		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
	}

}
