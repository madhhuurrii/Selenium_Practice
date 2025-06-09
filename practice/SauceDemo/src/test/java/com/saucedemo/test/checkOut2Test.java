package com.saucedemo.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.checkOut2;

public class checkOut2Test extends checkOutFormTest {
	
		
		@Test(priority=5)
		public void fin() {
			checkOut2 o = new checkOut2(driver);
			String url=o.finish();
			String expectedUrl="https://www.saucedemo.com/v1/checkout-complete.html";
			Assert.assertEquals(expectedUrl, url,"Sorryy wrond direction");
		}

	}


