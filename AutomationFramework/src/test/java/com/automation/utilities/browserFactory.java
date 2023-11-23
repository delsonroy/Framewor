package com.automation.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserFactory {

	
	
	public static WebDriver startApplication(WebDriver driver, String browser, String url)
	{
		
	   if(browser.equals("chrome"))
	   {
		   driver = new ChromeDriver();
		   
	   }
	   else if(browser.equals("Firefox"))
	   {
		   driver = new FirefoxDriver();
		   
	   }
	   else
	   {
		   System.out.println("We do not support this browser");
	   }
	   
	   
	  
	   
	   driver.get(url);
	   
	   
	   
	return driver;
	   
		
	}
	
	
	public static void teardown(WebDriver driver)
	{
		
		driver.close();
	}
	
}
