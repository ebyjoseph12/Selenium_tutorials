package com.sampletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnpages.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	
	@Test
	public void verifyLoginTest() {
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		LoginPage login= new LoginPage(driver); //  to create object for page class
		//login.verifyLoginButton();
		Assert.assertEquals(login.verifyLoginButton(), true);
		driver.close();	
	}
	
	@Test
	public void verifyAlertMessageTest() {
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		LoginPage login= new LoginPage(driver); //  to create object for page class
		login.clickLoginButton();
		Assert.assertEquals(login.verifyAlertMessage(), "Epic sadface: Username is required");
		driver.close();	
	}

}
