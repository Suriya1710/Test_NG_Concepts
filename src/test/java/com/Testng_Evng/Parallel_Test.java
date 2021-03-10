package com.Testng_Evng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Test {

	public static WebDriver driver;

	@Test
	private void amazon() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

	}

	@Test
	private void facebook() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

	}

	@Test
	private void instagram() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.instagram.com/?hl=en");

	}

}
