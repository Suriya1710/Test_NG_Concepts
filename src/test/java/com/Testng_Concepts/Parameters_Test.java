package com.Testng_Concepts;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Test {
	
	
	@Test
	@Parameters({"username", "password"})
public static void credentials(@Optional("Starc")String username, int password) {

		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
	}

}
