package com.jp.assesment;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class My_Test {
	
	@Test(retryAnalyzer = Retry_Analyser.class)
	private void validation() {

		assertEquals("Watson", "Sherlock");
	}

}
