package com.tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest1 extends BaseTest {          // adding inheritance property---extends BaseTest
		

	
	@Test (priority = 0)
	public void SwagLabsLogoTest() throws FileNotFoundException, IOException, ParseException {
	
	
	//login.enterUsername("standard_user");
	//login.enterPassword("secret_sauce");
		
	login.enterUsername();
	login.enterPassword();
	login.clickLoginButton();
	//home.verifySwagLabsLogo();
	Assert.assertEquals(home.verifySwagLabsLogo(), true);
	
	}
	
	
	@Test (priority = 1)
	public void SwagLabsProductTitleTest() throws FileNotFoundException, IOException, ParseException {
	
		
	//login.enterUsername("standard_user");
	//login.enterPassword("secret_sauce");
		
	login.enterUsername();
	login.enterPassword();
	login.clickLoginButton();
	//home.verifySwagLabsProductHeading()
	Assert.assertEquals(home.verifySwagLabsProductHeading(), "Products");
	
	}

}
