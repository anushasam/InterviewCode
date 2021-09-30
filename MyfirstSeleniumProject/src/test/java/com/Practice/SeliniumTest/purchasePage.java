package com.Practice.SeliniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class purchasePage {
	WebDriver driver;
	
	public purchasePage(WebDriver driver)

	{
		this.driver=driver;

		PageFactory.initElements(driver, this); 
		
	}
	

	@FindBy(xpath= "//input[@placeholder=\"First Last\"]")
	private WebElement nm;
	
	@FindBy(id="address")
	private WebElement adrs;
	
	@FindBy(id="city")
	private WebElement cty;
	
	@FindBy(id="zipCode")
	private WebElement zc;
	
	@FindBy(id="creditCardNumber")
	private WebElement cn;
	
	@FindBy(id="creditCardMonth")
	private WebElement cm;
	
	@FindBy(id="creditCardYear")
	private WebElement cy;
	

	@FindBy(id="nameOnCard")
	private WebElement noc;
	
	@FindBy(xpath="//input[@value =\"Purchase Flight\"]")
	private WebElement pf;
	
	
	
	
	
	public void purchaseTicket( String name, String address, String City, String  Zipcode, String cardnum, String cardmonth, String cardyear,String cardname) throws InterruptedException
	{
	
		nm.sendKeys(name);
		adrs.sendKeys(address);
		cty.sendKeys(City);
		zc.sendKeys(Zipcode);
		cn.sendKeys(cardnum);
		cm.sendKeys(cardmonth);
		cy.sendKeys(cardyear);
		noc.sendKeys(cardname);
		pf.click();
		
	}
	

}


