package selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class taskDateSelenium {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Razan\\Desktop\\QA\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		
		WebElement clicksite = driver.findElement(By.cssSelector("div[data-cy=\"landingContainer\"]"));
		clicksite.click();
		
		WebElement element = driver.findElement(By.id("departure"));
				element.click();
				
		
//		WebElement close = driver.findElement(By.cssSelector("span[class=\"langCardClose\"]"));
//		close.click();

	}

}
