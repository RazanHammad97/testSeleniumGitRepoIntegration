package selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionApi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AL THEQA\\Desktop\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("Web Driver" + Keys.ENTER);
		
		//searchField.sendKeys("selenium" + Keys.ENTER );
	    //searchField.clear();
		
		Actions actionProvider = new Actions(driver);
		Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build(); //ctrl+a
		keydown.perform();

		
		//searchField.sendKeys("selenium" + Keys.ENTER );
		//searchField.clear();
		
		
		
		
	}

}
