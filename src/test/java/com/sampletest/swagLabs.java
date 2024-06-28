package com.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class swagLabs {
	
	@Test
	public void loginButtonTest() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		Assert.assertEquals(driver.findElement(By.id("login-button")).isDisplayed(), true);
		driver.close();
	}
	

	@Test
	public void loginInvalidTest() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-button")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//h3[@data-test='error']")).getText(), "Epic sadface: Username is required");
		driver.close();
	}
	
	@Test
	public void swagLabsHeadingTest() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='app_logo'] ")).isDisplayed(), true);
		driver.close();
	}
	
	@Test
	public void productsHeadingTest() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='product_label']")).getText(), "Products");
		driver.close();
	}
	
	
}
