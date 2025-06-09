package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {
     public static void main(String[] args) {
    	 WebDriver driver = new ChromeDriver();
         
         driver.get("https://demoblaze.com/");
         
         // Total number of links
         List<WebElement> l=driver.findElements(By.tagName("a"));
         System.out.println(l.size());
         // Print the links
         for(WebElement li:l) {
        	 System.out.println(li.getAttribute("href"));
         }
         // Print Images
         List<WebElement> im=driver.findElements(By.tagName("img"));
         System.out.println(im.size());
         
         // Click on Product using linktext and partial linktext
         driver.findElement(By.linkText("Phones")).click(); 
         
         driver.findElement(By.partialLinkText("Phones")).click(); 
         
         
         driver.quit();
     }
      
      
      
      
}
