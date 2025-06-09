package com.selenium.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	public static WebDriver driver;
	
	public static WebDriver startApplication(WebDriver driver, String Browser, String appurl) {
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		driver.manage().window().maximize();
		driver.get(appurl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) {
		
		driver.quit();
	}

}
