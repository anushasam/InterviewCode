package com.Practice.SeliniumTest;

import org.testng.annotations.Test;

public class testcase extends BaseClass{
	
	@Test
	public void bookTicket () throws InterruptedException
	{
		
		homePage hp= new homePage(driver);
		driver.getTitle();
		
		hp.selectopt1();
		Thread.sleep(5000);
		hp.selectopt2();
		Thread.sleep(5000);
		hp.clickFindFFlight();
		Thread.sleep(5000);
		selectFlightPage sp= new selectFlightPage(driver);
		sp.chooseFlight();
		purchasePage pp= new purchasePage(driver);
		pp.purchaseTicket("Anusha","123,TPT", "Tirupathi" ,"1234", "5555555","10","27", "Anusha");
		
		
	}
	

	
	
	

}
