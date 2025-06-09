package com.selenium.test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.pages.BaseClass;
import com.selenium.pages.FlipHomePage;
import com.selenium.pages.FlipKartPage;

public class FlipHomeTest extends BaseClass {
	
	@BeforeClass
	@DataProvider(name="Home")
	public Object[] testData(){
		ArrayList a=excel.count("Sheet1");
		
		int r1=(int) a.get(0);
		int c1=(int) a.get(1);
		Object[] data= new Object[r1];
		for(int i=0;i<r1;i++) {
			data[i]=excel.stringData("Sheet1", i, 0);
			System.out.println(excel.stringData("Sheet1", i, 0));
		}
		return data;
		
	}
       
	@Test(priority=1, dataProvider="Home")
	public void TC01_SearchProduct(String prod) {
		test = extent.createTest("TC01_SearchProduct");
		System.out.println("HI");
		
		
		System.out.println(prod);
		FlipHomePage home = new FlipHomePage(driver);
	    String assert_s1=home.searchProd(prod);
//	    Assert.assertEquals(assert_s1,"Samsung S24");
	    home.enterKey();
	    System.out.println(driver.getCurrentUrl());
	    String expectedUrl="https://www.flipkart.com/search?q=Samsung%20S24&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off";
	    //String expectedUrl="https://www.flipkart.com/search?q=S";
	    extent.flush();
	    try {
	    	Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
	    }
	    catch (AssertionError e) 
	    {
	                test.fail(e);
	                Assert.fail();
	                extent.flush();
	    }

	}
	
	@Test(priority=2)
	public void TC02_FilterProduct() {
		test = extent.createTest("TC02_FilterProduct");
		FlipKartPage flip = new FlipKartPage(driver);
		flip.selectFilter();
		boolean flag2=flip.selectBrand();
		
		test.info("Done");
		Assert.assertTrue(flag2);
		extent.flush();
	}
	
	@Test(priority=3)
	public void TC03_DisplayProduct() {
		test = extent.createTest("Login Test");
		FlipKartPage flip = new FlipKartPage(driver);
		flip.displayFlip();
		test.info("Done");
		extent.flush();
		
		
	}
	
}
