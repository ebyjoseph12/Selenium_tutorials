package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest1 extends BaseTest {   // adding inheritance property---extends BaseTest

	
	WebDriver driver;
	
	@Test(priority = 0)
	public void verifyLoginTest() {
		
		//login.verifyLoginButton();
		Assert.assertEquals(login.verifyLoginButton(), true);
			
	}
	
	@Test(priority = 1)
	public void verifyAlertMessageTest() {
		
		login.clickLoginButton();
		Assert.assertEquals(login.verifyAlertMessage(), "Epic sadface: Username is required");
			
	}


}
