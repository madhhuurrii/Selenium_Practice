package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class cartPage extends BaseClass {
	WebDriver driver;
	//Constructors
	public cartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators
	By checkout = By.cssSelector("a.btn_action.checkout_button");
	
	
	//Actions
	public void check() {
		driver.findElement(checkout).click();
//		Assert.equals("https://www.saucedemo.com/v1/checkout-step-one.html")
		System.out.println(driver.getCurrentUrl());
	}

}
