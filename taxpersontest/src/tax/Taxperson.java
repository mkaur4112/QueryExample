//Calculate the total cost of an item including tax based on whether it is considered a necessary or luxury item. 
//The tax rate for basic necessities is 1%, the tax rate for luxury items is 9%. For simplicity of implementation, 
//all transactions are measured in cents (pennies).
package tax;

public class Taxperson 
{
	
public float CalculateTax(String type, int cost)
		{ 
		float totalcost;
		
			if((type.equalsIgnoreCase("basic")))
			{
				
				totalcost= cost+((cost*1)/100);
				
				return totalcost;
			}
			if (type.equalsIgnoreCase("luxury"))
			{
				
				totalcost=cost+((cost*9)/100);
				
				return totalcost;
			}
			else
		
				return cost;
			
			
		}}


