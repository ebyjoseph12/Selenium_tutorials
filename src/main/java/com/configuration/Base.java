package com.configuration;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.utilities.Utilities;

public class Base {
	
	public static WebDriver driver;    // creating  webdriver object reference
	
	//providing headless browser support, create browseroptions object reference in class level 
	public static ChromeOptions chromeOptions;
	public static FirefoxOptions firefoxOptions;
	public static EdgeOptions edgeOptions;
	
	public static void initialisation() throws IOException 
	{
		//String browser = System.getProperty("browsername", "chrome");
		String browser = System.getProperty("browsername",Utilities.getpropertiesFileValue("browser"));
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("headlesschrome"))
		{
			chromeOptions= new ChromeOptions();
			chromeOptions.addArguments("--headless");
			driver=new ChromeDriver(chromeOptions);
		}
		else if(browser.equalsIgnoreCase("headlessfirefox"))
		{
			firefoxOptions= new FirefoxOptions();
			firefoxOptions.addArguments("--headless");
			driver=new FirefoxDriver(firefoxOptions);
		}
		else if(browser.equalsIgnoreCase("headlessedge"))
		{
			edgeOptions= new EdgeOptions();
			edgeOptions.addArguments("--headless");
			driver=new EdgeDriver(edgeOptions);
		}
		else
		{
			System.out.println("Invalid option");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.get("https://www.saucedemo.com/v1/");
		driver.get(Utilities.getpropertiesFileValue("url"));
		driver.manage().window().maximize();			
	}			
}
