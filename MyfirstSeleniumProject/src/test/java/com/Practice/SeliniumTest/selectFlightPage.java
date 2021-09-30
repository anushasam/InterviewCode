

package com.Practice.SeliniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class selectFlightPage extends BaseClass{


	WebDriver driver;

	public selectFlightPage(WebDriver driver)

	{

		this.driver=driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="/html/body/div[2]/table/tbody/tr[1]/td[1]/input")
	private WebElement Choosebt;

	

	public void chooseFlight()
	{
		
		Choosebt.click();

	}
	


}
