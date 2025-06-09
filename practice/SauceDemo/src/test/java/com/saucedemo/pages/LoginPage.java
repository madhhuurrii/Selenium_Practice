package com.saucedemo.pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass {
	WebDriver driver;
      //Constructors
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	  // Locators
	  By userName = By.xpath("//input[@id='user-name']");
	  By passWord = By.xpath("//input[@id='password']");
	  By submitBtn = By.xpath("//input[@id='login-button']");
	  By logo = By.xpath("//div[@class='login_logo']");
	  
	  
	  
	  // Actions
	  public boolean logoDisplay() {
		   boolean flag= driver.findElement(logo).isDisplayed();
		   return flag;
		   
	  }
	  
	  public void LoginData(String a,String b){
	    driver.findElement(userName).sendKeys(a);
	    driver.findElement(passWord).sendKeys(b);
	    
	    


	  }
	  public void LoginSubmit(){
	    driver.findElement(submitBtn).click();
	    String url = driver.getCurrentUrl();
//	    Assert.assertEquals(url,"https://www.saucedemo.com/v1/inventory.html","Sorry not correct flow!" );
//	    
	   
	  }
//	  public void acceptAlert() {
//		  Alert a = driver.switchTo().alert();
//		  a.accept();
//	  }

	  
	
}
