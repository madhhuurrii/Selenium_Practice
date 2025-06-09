package com.saucedemo.test;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.saucedemo.pages.BaseClass;
import com.saucedemo.pages.LoginPage;

public class LoginTest extends BaseClass{
//	WebDriver driver;
	
	
	@Test(priority=1)
	public  void login() {
		
		
		test = extent.createTest("Login Test");
		LoginPage p = new LoginPage(driver);
	    
	    Assert.assertTrue(p.logoDisplay());
	    // p.setup();
	    p.LoginData(excel.stringData("Login",0,0), excel.stringData("Login",0,1));
//	    p.LoginData(excel.stringData("Login",0,0), "madhuri");
	    p.LoginSubmit();
	    
//	    Helper.CaptureScreenshot(driver);
//	    p.acceptAlert();
	    String expectedUrl="https://www.saucedemo.com/v1/inventory.html";
	    Assert.assertEquals(driver.getCurrentUrl(), expectedUrl,"Sorryy you are not logged in!");
	    test.pass("Logged In");
	    
	    extent.flush();

	  }
	
	




}
