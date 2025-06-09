package com.saucedemo.test;

import org.testng.annotations.Test;

import com.saucedemo.pages.cartPage;

public class cartTest extends inventoryTest {

	@Test(priority=3)
	public void checkOut() {
		test = extent.createTest("Login Test");
		cartPage c=new cartPage(driver);
		c.check();
		
		 test.pass("Logged In");
		    
		    extent.flush();

		
		
	}
}
