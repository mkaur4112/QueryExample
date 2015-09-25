package com.org.williamPages.com;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;


public class WilliamHomePage extends WilliamSonomaPage
{
public void opensonoma(){
		
		driver.get("http://www.williams-sonoma.com/");
		driver.manage().window().maximize();
		}
		
		public void OverlayClose()
		{
		driver.findElement(By.id("ad_email_btn-close")).click();
		}
		
		public void WilliamTab()
		{
			driver.findElement(By.linkText("WILLIAMS-SONOMA HOME")).click();  //click on the William-Sonoma Home Tab

		}
		
		
public void FurnitureTab()           
{
	//mouse over the furniture tab
	Actions action = new Actions(driver);
	WebElement Furniture=driver.findElement(By.className("topnav-home-furniture "));
     action.moveToElement(Furniture).build().perform();
	
     // click on sofa and loveseats tab
     
     driver.findElement(By.linkText("Sofas & Loveseats")).click();
     
}
}
