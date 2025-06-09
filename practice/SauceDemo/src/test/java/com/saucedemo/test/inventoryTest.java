package com.saucedemo.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.inventoryPage;

public class inventoryTest extends LoginTest {
	
	
	
	@Test(priority=2)
	public void inventory(){
		test = extent.createTest("Login Test");
		System.out.println(driver.getCurrentUrl());
	      inventoryPage in = new inventoryPage(driver);
	      in.sort("lohi");
	      in.addToCart(2);
	      test.info("Done!");
	      String url=in.goToCart();
	      String expectedUrl="https://www.saucedemo.com/v1/cart.html";
	      
	      Assert.assertEquals(expectedUrl, url,"Sorry wrong direction");
	      test.pass("Logged In");
		    
		    extent.flush();

	   }
}
