package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkOut2 extends BaseClass {
	WebDriver driver;
	// Constructor
	public checkOut2(WebDriver driver) {
		this.driver=driver;
	}
	
	//locators
	By finishBtn = By.xpath("//a[@class='btn_action cart_button']");
	
	
	//Actions
	public String finish() {
		driver.findElement(finishBtn).click();
		return driver.getCurrentUrl();
		
	}

}
