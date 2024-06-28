package com.sampletest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnpages.HomePage;
import com.learnpages.LoginPage;

public class HomeTest {
	
	WebDriver driver;
	
	@Test 
	public void SwagLabsLogoTest() {
	driver= new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().fullscreen();
	LoginPage login= new LoginPage(driver);
	HomePage home= new HomePage(driver);
	login.enterUsername("standard_user");
	login.enterPassword("secret_sauce");
	login.clickLoginButton();
	//home.verifySwagLabsLogo();
	Assert.assertEquals(home.verifySwagLabsLogo(), true);
	driver.close();	
	}
	
	
	@Test 
	public void SwagLabsProductTitleTest() {
	driver= new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().fullscreen();
	LoginPage login= new LoginPage(driver);
	HomePage home= new HomePage(driver);
	login.enterUsername("standard_user");
	login.enterPassword("secret_sauce");
	login.clickLoginButton();
	//home.verifySwagLabsProductHeading()
	Assert.assertEquals(home.verifySwagLabsProductHeading(), "Products");
	driver.close();	
	}
	
	
	

}
