package com.selenium.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipHomePage extends BaseClass {
	
	WebDriver driver;
	// PageFactory & Constructor
	public FlipHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	@FindBy (xpath="//input[@placeholder='Search for Products, Brands and More']")
	public WebElement searchBox;
	
	
	public String searchProd(String prod) {
		searchBox.sendKeys(prod);
		return prod;
	}
	public void enterKey() {
		Actions a = new Actions(driver);
		a.keyDown(Keys.ENTER).keyUp(Keys.ENTER);
		a.build().perform();
		
	}

}
