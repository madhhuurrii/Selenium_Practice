package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class condnMethods {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Condition methods returns boolean value
		// isDisplayed()
		WebElement k = driver.findElement(By.xpath("//h1[@class='title']"));
		System.out.println(k.isDisplayed());
		
		
		WebElement k1 = driver.findElement(By.xpath("//input[@id='name']"));
		//input[@id='male']
		//input[@id='name']
		//body
		System.out.println(k1.isDisplayed());
		
		//isSelected()
		WebElement s=driver.findElement(By.xpath("//input[@id='male']"));
		System.out.println(s.isSelected());
		
		WebElement s1=	driver.findElement(By.xpath("//input[@id='sunday']"));
		s1.click();
		System.out.println(s1.isSelected());
		
		//isEnabled()
		WebElement b=driver.findElement(By.xpath("//button[@name='start']"));
		System.out.println(b.isEnabled());
		
		
		driver.quit();
		
		
		
	}

}
