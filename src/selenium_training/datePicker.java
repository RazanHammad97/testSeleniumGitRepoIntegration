package selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Razan\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/");
		driver.manage().window().maximize();
		WebElement datePicker = driver.findElement(By.name("bdaytime"));
		datePicker.sendKeys("21122021");
		datePicker.sendKeys(Keys.TAB);
		datePicker.sendKeys("0103AM");
		WebElement submitBtn = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
		submitBtn.click();
		// there is a problem.
	}

}
