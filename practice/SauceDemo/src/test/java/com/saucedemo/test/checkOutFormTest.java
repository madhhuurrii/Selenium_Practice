package com.saucedemo.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.pages.checkOutFormPage;

public class checkOutFormTest extends cartTest {
	@Test(priority=4)
	public void checkOutform() {
		checkOutFormPage f = new checkOutFormPage(driver);
		f.formData("Madhuri","Ramakrishnan", "400708");
		String url=f.btnClick();
//		String url="";
		String expectedUrl="https://www.saucedemo.com/v1/checkout-step-two.html";
		Assert.assertEquals(expectedUrl, url,"Sorryy");
		
	}

}
