package selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keysdownup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AL THEQA\\Desktop\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchField = driver.findElement(By.name("q"));
		Actions actionProvider = new Actions(driver);
		actionProvider.keyDown(Keys.SHIFT).sendKeys(searchField,"web driver").keyUp(Keys.SHIFT).sendKeys("web driver").perform();
		
		  
		  
		  
		  

		
		

	}

}
