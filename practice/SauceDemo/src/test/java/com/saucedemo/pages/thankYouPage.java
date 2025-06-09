package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class thankYouPage extends BaseClass {
	WebDriver driver;
 
	//Constructor
	public thankYouPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators
	By thankLogo = By.xpath("//img[@class='pony_express']");
	
	
	//Actions
	public boolean thankyou() {
		WebElement e= driver.findElement(thankLogo);
		if(e.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
