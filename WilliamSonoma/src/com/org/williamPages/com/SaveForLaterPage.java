package com.org.williamPages.com;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class SaveForLaterPage extends WilliamSonomaPage
{
	public void SaveLater()
	{
	//click on save to later button
	driver.findElement(By.linkText("Save For Later")).click();
	//driver navigates to the page---https://secure.williams-sonoma.com/shoppingcart/ where I get confirmation of one item is saved.
	}
	public void verifysaved()
	{
		String txt=driver.findElement(By.xpath("//p[@class='save-for-later-message']")).getText();
		Assert.assertEquals(txt.contains("saved item."),true);
	}
	}

