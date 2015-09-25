package com.learning.costco.pages;

import org.openqa.selenium.By;

public class ProductListingsPage extends CostcoPage
{
		
	public void signInToBuy()
	{
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}



