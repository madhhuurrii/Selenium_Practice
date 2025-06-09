package com.selenium.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKartPage {
	
	WebDriver driver;
	
	public FlipKartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Mobiles']")
	WebElement filterMobile;
	
	@FindBy(xpath="//div[@title='SAMSUNG']//div[@class='XqNaEv']")
	WebElement checkBrand;
	
	@FindBy(xpath="//div[@class='KzDlHZ']")
	List<WebElement> prodName;
	
	@FindBy(xpath="//div[@class='Nx9bqj _4b5DiR']")
	List<WebElement> disPrice;
	
	public void selectFilter() {
		filterMobile.click();
		
	}
	
	public boolean selectBrand() {
		
		checkBrand.click();
//		System.out.println(checkBrand.getAttribute("innerHTML"));
//		if(checkBrand) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return true;
		
	}
	public void displayFlip() {
	for(int i=0;i<prodName.size();i++) {
		        
		        try{
		        	System.out.println("Product Name: "+prodName.get(i).getText()+" Price: "+disPrice.get(i).getText());	
	//	            break;
		         }
		         catch(Exception e){
		        	 System.out.println(e.getMessage());
		         }
		    }
	}
	
	
	
	

}
