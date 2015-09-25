package com.org.williamPages.com;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;



public class FabricCushionPage extends WilliamSonomaPage 
{
	public void FabricDrop()
	{
		//choose the tile corresponding to the specific fabric and color
driver.findElement(By.xpath("//ul[@class='thumb-swatches']//li[@title='Textured Cotton/Linen, Navy, Grade B']")).click();
// choose the nailhead
driver.findElement(By.xpath("//ul[@class='selectorsContainer visual-attributes selections-container textual-att']//li[1]")).click();	
	}

public void AddToCART()   //adding to the cart
{
driver.findElement(By.xpath("//button[@class='btn btn_addtobasket btn_addtobasket_add']")).click();
}

public void Switchwindows()      //clicking on checkout

{
		String homepage = driver.getWindowHandle();
	//	String poppage = driver.getWindowHandle();
        Set <String> windows = driver.getWindowHandles();

		Iterator iterator = windows.iterator();
		String currentwindowid;
		while(iterator.hasNext())
		{
		currentwindowid = iterator.next().toString();
		if(!currentwindowid.equals(homepage))
		{
      driver.switchTo().window(currentwindowid);
		}}
}
		
		public void Checkout()
		{
			driver.findElement(By.id("anchor-btn-checkout")).click();
		}
		
	
}


