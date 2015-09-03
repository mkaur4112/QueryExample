//Calculate the total cost of an item including tax based on whether it is considered a necessary or luxury item. 
//The tax rate for basic necessities is 1%, the tax rate for luxury items is 9%. For simplicity of implementation, 
//all transactions are measured in cents (pennies).
package tax;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TaxPersonTest 
{
Taxperson txper= new Taxperson();
float result;
 @Test
	  public void CalBasic()
	  {
		  result=txper.CalculateTax("Basic", 200);
		  assertEquals(201,Math.round(result));
		  
	  }
	  
	  @Test
	  public void CalLuxury()
	  {
		  result=txper.CalculateTax("luxury",500);
		   assertEquals(545, Math.round(result));
		 
	  }
	  
	@Test
	public void Others()
	{
		result=txper.CalculateTax("Other",100);
		assertEquals(100, Math.round(result));
	}
	}