package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		//driver.get("https://www.opencart.com/index.php?route=cms/demos");
        String s=driver.getTitle();
        
        if(s.equals("Web form")){
            System.out.println(s+" Right");
        }
        else {
        	System.out.println("Wrong title");
        }
        driver.quit();
		
	}

}
