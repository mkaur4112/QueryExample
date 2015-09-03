package tax;

import java.util.Scanner;

public class Taxmain {
public static void main(String[] args) {
		
		Taxperson tax=new Taxperson();
		
		System.out.println(" Enter the item type:");
		Scanner type= new Scanner(System.in);
		String item=type.next();
		System.out.println("Enter the price of the item");
		Scanner price = new Scanner(System.in);
		int Price = price.nextInt();
		
		
		float total=tax.CalculateTax(item, Price);
		
		System.out.println("The price of the \""+ item + "\" item is "+ Math.round(total) +" cents");
		
		
		
		
		
		
		

	}

}


