package com.learnpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	By swagLabsLogo= By.xpath("//div[@class='app_logo'] ");
	By swagLabsProductHeading= By.xpath("//div[@class='product_label']");
	
	public HomePage(WebDriver driver) {      // It is an constructor
		this.driver=driver;
	}
	
	public boolean verifySwagLabsLogo(){
		return driver.findElement(swagLabsLogo).isDisplayed();
	}
	
	public String verifySwagLabsProductHeading(){
		return driver.findElement(swagLabsProductHeading).getText();
	}
	
	

}
