package com.learning.costco.tests;

import org.testng.annotations.Test;

import com.learning.costco.pages.*;

public class AppleProductBuyTest
 {
  
HomePage home = new HomePage();

  AppleProductsHomePage applehome = new AppleProductsHomePage();

  ProductListingsPage productlists= new ProductListingsPage();

@Test
  
public void f()
 {
	
home.openCostco();

home.search("Ipad");

applehome.shopIpad();
	
productlists.signInToBuy();
  
}

}

