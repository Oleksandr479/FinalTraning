package com.seleniumremanding.oak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {

	public static WebDriver driver = null;
	
	
	@BeforeTest
	public void browserSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void closingBrowser() 
	{
		driver.close();
	}
	
	
}
