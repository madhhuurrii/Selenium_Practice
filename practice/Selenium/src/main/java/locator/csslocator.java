package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslocator {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		// By Tag class  name
		driver.findElement(By.cssSelector("div.row"));
		// By Tag ID name
		driver.findElement(By.cssSelector("div#tbodyid"));
		// By tag Attribute
		driver.findElement(By.cssSelector("a[onclick=\"byCat('notebook')\"]"));
		// Tag class Attribute
		driver.findElement(By.cssSelector("a.list-group-item[onclick=\"byCat('notebook')\"]"));
		
		driver.quit();
		
	}

}
