package selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AL THEQA\\Desktop\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("Web driver");
		
		WebElement imvLogo = driver.findElement(By.cssSelector("img[alt=\"Google\"]"));
		imvLogo.click();
		
		Thread.sleep(1000);
		
		WebElement btnSearch = driver.findElement(By.name("btnK"));
		
		Actions actionProvider = new Actions(driver);
		actionProvider.doubleClick(btnSearch).build().perform();

	}

}
