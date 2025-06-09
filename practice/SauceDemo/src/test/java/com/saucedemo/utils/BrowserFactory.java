package com.saucedemo.utils;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {
	public static WebDriver startApplication(WebDriver driver, String browser, String appUrl) {
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//			chrome_opt = webdriver.ChromeOptions();
			
			final Map<String, Object> chromePrefs = new HashMap<>();
			chromePrefs.put("credentials_enable_service", false);
			chromePrefs.put("profile.password_manager_enabled", false);
			chromePrefs.put("profile.password_manager_leak_detection", false); // <======== This is the important one

			final ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("prefs", chromePrefs);
			driver = new ChromeDriver(chromeOptions);
		}
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
		
	}
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
    
}
