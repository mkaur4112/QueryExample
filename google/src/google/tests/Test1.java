package google.tests;
import org.testng.annotations.Test;

import google.pages.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 
{		
		
	pages page;
	public WebDriver driver;
	
@BeforeTest
	public void setup()
	{
		this.driver = new FirefoxDriver();
		page = PageFactory.initElements(driver, pages.class);
		driver.get(page.url);
		driver.manage().window().maximize();
	}
	
@Test		
	public void test2 () throws InterruptedException
	{
	page.googlesearch("12345");
	Thread.sleep(3000);
	
		}
	
	@Test
	public void test3() throws InterruptedException
	
	{
		Thread.sleep(3000);
		
		page.verifyresultspage();	
	}
	
	@Test
	public void test4()
	{
		page.verifyimage();
			}
	@Test
	public void test5() throws InterruptedException
	{
		Thread.sleep(3000);
		page.verifyurl();
			}
	@Test
	public void test6()
	{
		page.verifytext();
			}
	
@AfterTest
	public void closedriver()
	{
		driver.close();
	}
	
}
  
