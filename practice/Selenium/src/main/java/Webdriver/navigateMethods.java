package Webdriver;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class navigateMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/prod.html?idp_=1");
		
		// URL myurl = new URL("https://demoblaze.com/prod.html?idp_=1");
		
		//navigate to(accepts url)
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(100));
		//navigate back
		driver.navigate().back();
		WebDriverWait mywait1 = new WebDriverWait(driver, Duration.ofSeconds(100));
		
		//navigate forward
		driver.navigate().forward();
		
		// navigate refresh
		driver.navigate().refresh();		
		
		
		
		driver.quit();
	}

}
