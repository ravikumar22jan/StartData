package com.startdate.project;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


		
		public WebDriver driver;
		@BeforeMethod
		
		public void preCondition()
		{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ravikumar.d\\eclipse-workspace\\StartDate\\jars\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://10.160.64.11/startdateapp/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	    }
		
		

		
		@AfterMethod
		
		public void postCondition()
		{
			driver.close();
		}

}
