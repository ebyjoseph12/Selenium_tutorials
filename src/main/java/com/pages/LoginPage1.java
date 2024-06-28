package com.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.Utilities;

public class LoginPage1 {
	
	//this is page class
	
		WebDriver driver;
		By loginButton= By.id("login-button");
		By alertMessage= By.xpath("//h3[@data-test='error']");
		By userName= By.id("user-name");
		By passWord= By.id("password");
		
		
		public LoginPage1(WebDriver driver) {      // It is an constructor
			this.driver=driver;
		}
		
		
		//      Methods...............................................................................
		
		public boolean verifyLoginButton(){                                  // Is displayed method 
			//return driver.findElement(loginButton).isDisplayed();
			return Utilities.isElementDisplayed(driver, loginButton);
			
		}
		
		
		public void clickLoginButton() {                                     // click action method
			//driver.findElement(loginButton).click();
			Utilities.ClickElement(driver, loginButton);
		}
		
		
		public String verifyAlertMessage() {                                  // getText  method
			//return driver.findElement(alertMessage).getText();
			return Utilities.getTextValue(driver, alertMessage);
			
		}
		
		public void enterUsername() throws FileNotFoundException, IOException, ParseException {                         // enter userName
			//driver.findElement(usernName).sendKeys(username);
			Utilities.enterText(driver, userName, Utilities.readJsonFile("username", "./src/main/resources/login.json"));
		}
		
		public void enterPassword() throws FileNotFoundException, IOException, ParseException {                         // enter password
			//driver.findElement(passWord).sendKeys(password);
			Utilities.enterText(driver, passWord, Utilities.readJsonFile("password", "\"./src/main/resources/login.json\""));
		}

}
