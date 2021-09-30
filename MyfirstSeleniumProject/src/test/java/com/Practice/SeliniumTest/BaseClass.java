package com.Practice.SeliniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	
	public class BaseClass {
		WebDriver driver; 
		
		@BeforeClass
		public void setUp() {
		
			
			System.setProperty("webdriver.chrome.driver", "/Users/chaithanyagattu/Downloads/chromedriver");
			driver =new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://blazedemo.com/");

		}
		
		
		
		@AfterClass
		public void close() {
			driver.quit();
			
		}
	}
