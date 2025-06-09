package com.saucedemo.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.thankYouPage;

public class thankYouTest extends checkOut2Test {

    @Test(priority=6)	
	public void th() {
		thankYouPage y= new thankYouPage(driver);
		boolean f=y.thankyou();
		Assert.assertTrue(f);
	}
	

}
