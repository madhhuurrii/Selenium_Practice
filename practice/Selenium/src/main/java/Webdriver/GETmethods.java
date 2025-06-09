package Webdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GETmethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//GET Methods
		//get(url)
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//getTitle()
		System.out.println(driver.getTitle());
		
		//getCurrentUrl()
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource()
		System.out.println(driver.getPageSource());
		
		//getWindowHandle()
		System.out.println(driver.getWindowHandle());
		
		//getWindowHandles() multiple tab id
		Set<String> s= driver.getWindowHandles();
		System.out.print(s);
		
		driver.quit();
		
		
	}

}
