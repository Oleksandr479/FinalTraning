package com.seleniumremanding.oak;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.Driver;

public class TitleAndTextVerifycation extends BasicTest {

	@Test
	public void VerifyTitle() 
	{
		driver.get("https://www.saucedemo.com/");
		String actualtitle = driver.getTitle();
		String expectedtitle = "Swag Labss";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualtitle, expectedtitle);
		softassert.assertAll();
	}
	@Test
	public void VeifyText() 
	{
		driver.get("https://www.saucedemo.com/");
		String expectedvalue  = "Login" ;
		String actualvalue = driver.findElement(By.xpath("//input[@value = 'Login']")).getAttribute("value");
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualvalue, expectedvalue);
		softassert.assertAll();
	}
}
