package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		// Driver setup
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Locators
		
		// Hompage [Search Product]
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
	    searchBox.sendKeys("Samsung s10");
	    
	    Actions a = new Actions(driver);
	    
	    a.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	    
	    // Filter out Mobiles
	    driver.findElement(By.xpath("//a[@title='Mobiles']")).click();
	    
	    
	    // Select the Brand checkbox
	    driver.findElement(By.xpath("//div[@title='SAMSUNG']//div[@class='XqNaEv']")).click();
	    
	    // Scroll page
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    
	    
	    // Select Filpkart RestAssured [Not Working]
	    WebElement flipAssured =driver.findElement(By.xpath("//label[@class='tJjCVx cnLG4I']//div[@class='XqNaEv eJE9fb']"));
	    a.moveToElement(flipAssured).click().perform();
	    
//	    flipAssured.click();
	    List<WebElement> prodName=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
	    List<WebElement>  disPrice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
	    
	    for(int i=0;i<prodName.size();i++) {
	        
	        try{
	        	System.out.println("Product Name: "+prodName.get(i).getText()+" Price: "+disPrice.get(i).getText());	
//	            break;
	         }
	         catch(Exception e){
	        	 System.out.println(e.getMessage());
	         }
	    }
	    System.out.println(prodName.size()+" "+disPrice.size());
//	    for(int i=0;i<disPrice.size();i++) {
//	        System.out.println("Price: "+disPrice.get(i).getText());	
//	    }
	    
	    driver.quit();
	    
	    
	}

}
