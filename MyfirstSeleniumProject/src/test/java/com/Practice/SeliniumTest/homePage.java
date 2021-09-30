package com.Practice.SeliniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class homePage {
	WebDriver driver;

	public homePage(WebDriver driver)

	{

		this.driver=driver;

		PageFactory.initElements(driver, this); 
		
	}
	

	@FindBy(name="fromPort")
	private WebElement frm;
	
	@FindBy(name="toPort")
	private WebElement to;
	
	@FindBy(xpath= "//input[@type=\"submit\"]")
	private WebElement clck;
	
	
	public void selectopt1()
	{
	
	Select drpdown = new Select(frm);
	drpdown.selectByIndex(1);
	
	}
	public void selectopt2()
	{
	
	Select drpdown = new Select(to);
	drpdown.selectByIndex(1);
	
	}
	
	public void clickFindFFlight() throws InterruptedException
	{
		clck.click();
	}

}
