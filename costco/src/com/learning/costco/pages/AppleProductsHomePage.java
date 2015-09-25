
package com.learning.costco.pages;
import org.openqa.selenium.By;

public class AppleProductsHomePage extends CostcoPage 
 {
		
public void shopIpad()
	
{
		
driver.findElement(By.xpath("//div[@class='rfp-cat-feature']/a")).click();

}


}
