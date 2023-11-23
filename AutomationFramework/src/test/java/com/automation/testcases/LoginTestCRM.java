package com.automation.testcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.automation.utilities.browserFactory;
public class LoginTestCRM {

	WebDriver driver;
	
	@Test
	public void loginAPP()
	{
	
		browserFactory.startApplication(driver, "chrome", "https://www.google.com");
		System.out.println(driver.getTitle());
		browserFactory.teardown(driver);
		
	}
}
