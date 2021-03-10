package com.Testng_Evng;

import org.testng.annotations.Test;

public class Expected_Exceptions {

	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	private void add() {
		int a[]= new int [2];
		a[0]= 10;
		a[1] = 25;
		
		System.out.println(a[23]);
		
	}
	
	
	
}
