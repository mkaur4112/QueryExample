package com.org.williamPages.com;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;

public class SofasPage extends WilliamSonomaPage 
{
	public void Sofa() 
	{
		

	 try 
		{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	WebElement Sofa2=driver.findElement(By.xpath("//ul[@class='shop-list product-list']//li[2]/div/a/span[2]"));
	 Sofa2.click();
	

}
}