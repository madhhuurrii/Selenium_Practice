package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkOutFormPage {
	WebDriver driver;
	//Constructors
	public checkOutFormPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators
	By firstName = By.xpath("//input[@id='first-name']");
	By lastName = By.xpath("//input[@id='last-name']");
	By zipCode = By.xpath("//input[@id='postal-code']");
	
	By submitBtn = By.xpath("//input[@value='CONTINUE']");
    
	
	// Actions
	public void formData(String a, String b, String c) {
		driver.findElement(firstName).sendKeys(a);
		driver.findElement(lastName).sendKeys(b);
		driver.findElement(zipCode).sendKeys(c);
	}
	
	public String btnClick() {
		driver.findElement(submitBtn).click();
		return driver.getCurrentUrl();
	}
	
}
