package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.Utilities;

public class HomePage1 {
	
	WebDriver driver;
	By swagLabsLogo= By.xpath("//div[@class='app_logo'] ");
	By swagLabsProductHeading= By.xpath("//div[@class='product_label']");
	
	public HomePage1(WebDriver driver) {      // It is an constructor
		this.driver=driver;
	}
	
	public boolean verifySwagLabsLogo(){
		//return driver.findElement(swagLabsLogo).isDisplayed();
		return Utilities.isElementDisplayed(driver, swagLabsLogo);
	}
	
	public String verifySwagLabsProductHeading(){
		//return driver.findElement(swagLabsProductHeading).getText();
		return Utilities.getTextValue(driver, swagLabsProductHeading);
	}
	
	

}
