package google.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class pages
{	
	
	WebDriver driver;
	public String url = "https://www.google.com/";
	
	@FindBy(how = How.NAME, using = "q")
	@CacheLookup
	private WebElement txtsearch;
	
	@FindBy(how = How.NAME,using="btnG")
	public WebElement btnsearch;
	
	@FindBy(how = How.ID,using="resultStats")
	public WebElement resultpage;
	
	@FindBy(how = How.ID,using="lu_map")
	public WebElement imagepage;	
	
	@FindBy(how = How.XPATH,using="//div[@class='lu_map_section']/a")
	public WebElement urlverify;
	
	@FindBy(how = How.NAME, using = "q")
	public WebElement searchtxt;	
	
	
	
	public pages(WebDriver driver)
	{
	this.driver = driver;
	}		
	
	
	public void googlesearch(String searchterm)
	{
		txtsearch.sendKeys(searchterm);
		btnsearch.click();
	}	
	
	
	public void verifyresultspage()
	{		
		String txt=resultpage.getText();		
		Assert.assertEquals(txt.contains("results"),true);
		System.out.println("1.Results page displayed");
	}
	
	public void verifyimage()
	{
		imagepage.click();
		String title = imagepage.getAttribute("title");
		
		System.out.println("2.Title of the image :"+title);
		String tag = imagepage.getTagName();
		System.out.println("3.Image tagname :"+tag);		
	}
	
		public void verifyurl(){
			String link = urlverify.getAttribute("href");
			System.out.println("url of the link is ;"+link);
			Assert.assertEquals(link.contains("https://www.google.com/maps/place"),true);
				}	
		
			
		public void verifytext(){
			String txt = searchtxt.getAttribute("value");
			System.out.println("Text in the search box is :"+txt);
			Assert.assertEquals(txt,"12345");
}
}
