package com.org.williamTests.com;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.org.williamPages.com.*;
public class WilliamSonoma extends WilliamSonomaPage      //extending the page lss class
{
	WilliamHomePage Home=new WilliamHomePage();               //creating the objects of the page classes
	SofasPage SoPa=new SofasPage();
	FabricCushionPage Fab=new FabricCushionPage();
	SaveForLaterPage Save=new SaveForLaterPage();
	


@Test(priority=1)
public void test1() throws InterruptedException{
	Home.opensonoma();
	Home.OverlayClose();
	Thread.sleep(5000);
	Home.WilliamTab();	
}

@Test(priority=2)
public void test2() throws InterruptedException{
	Home.FurnitureTab();
	Thread.sleep(5000);
}
		
@Test(priority=4)
public void test4() throws InterruptedException{
	SoPa.Sofa();
	Thread.sleep(5000);
}
@Test(priority=5)
public void test5(){		
	Fab.FabricDrop();		
Fab.AddToCART();
}
@Test(priority=6)
public void test6() throws InterruptedException{		
	Fab.AddToCART();
	Thread.sleep(5000);
}

@Test(priority=7)
public void test7() throws InterruptedException{		
	Fab.Switchwindows();
	Thread.sleep(5000);
}
@Test(priority=8)
public void test8(){		
	Fab.Checkout();
	Save.SaveLater();
	Save.verifysaved();
}

}