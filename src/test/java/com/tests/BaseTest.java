package com.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.configuration.Base;
import com.pages.HomePage1;
import com.pages.LoginPage1;

public class BaseTest extends Base  {
	
	//webDiver initialization....................................................................................................................
	
	//WebDriver driver;
	LoginPage1 login;
	HomePage1 home;
	
	
	@BeforeMethod
	public void setup() throws IOException {
//		driver= new ChromeDriver();
//		driver.get("https://www.saucedemo.com/v1/");
//		driver.manage().window().maximize();
		initialisation();   // cross browser testing method
		login= new LoginPage1(driver);
		home= new HomePage1(driver);
		
	}
	
	
	@AfterMethod
	
	public void teardown() {
		
		driver.close();	
		
	}

}
