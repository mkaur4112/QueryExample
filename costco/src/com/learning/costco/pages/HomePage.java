
	package com.learning.costco.pages;
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.*;

	public class HomePage extends CostcoPage
	{
		By searchfield=By.id("SimpleSearchForm_SearchTerm");
		
		public void openCostco()
		{
			driver.get("http://www.costco.com");
			driver.manage().window().maximize();
		}

		public void search(String searchterm)
		{
			WebElement searchfield=driver.findElement(this.searchfield);
			searchfield.sendKeys(searchterm);
			driver.findElement(By.id("search_submit")).click();
		}
		public void getSearchSuggestions(String searchterm)
		{
			driver.findElement(searchfield).sendKeys(searchterm);
		}
	}


