package com.learnpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//this is page class
	
	WebDriver driver;
	By loginButton= By.id("login-button");
	By alertMessage= By.xpath("//h3[@data-test='error']");
	By usernName= By.id("user-name");
	By passWord= By.id("password");
	
	
	public LoginPage(WebDriver driver) {      // It is an constructor
		this.driver=driver;
	}
	
	public boolean verifyLoginButton(){                                  // Is displayed method 
		return driver.findElement(loginButton).isDisplayed();	  
	}
	
	
	public void clickLoginButton() {                                     // click action method
		driver.findElement(loginButton).click();
	}
	
	
	public String verifyAlertMessage() {                                  // getText  method
		return driver.findElement(alertMessage).getText();
		
	}
	
	public void enterUsername(String username) {                         // enter userName
		driver.findElement(usernName).sendKeys(username);
	}
	
	public void enterPassword(String password) {                         // enter password
		driver.findElement(passWord).sendKeys(password);
	}
	
	
	

}
