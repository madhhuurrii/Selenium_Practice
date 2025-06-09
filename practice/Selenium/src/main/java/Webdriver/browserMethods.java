package Webdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.navigate().to("https://demoblaze.com/index.html#");
		driver.get("https://demoblaze.com/index.html#");
		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		driver.close();
		
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
		
		driver.quit();
		
	}

}
