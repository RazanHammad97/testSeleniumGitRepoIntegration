package selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingIframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AL THEQA\\Desktop\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		WebElement loginIframe = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(loginIframe);
		WebElement fname = driver.findElement(By.id("fname"));
		fname.clear();
		fname.sendKeys("Razan");
		WebElement lname = driver.findElement(By.id("lname"));
		lname.clear();
		lname.sendKeys("Hammad");
		WebElement submitBtn = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
		submitBtn.click();
		
		driver.switchTo().defaultContent();
		
		WebElement runBtn = driver.findElement(By.id("runbtn"));
		runBtn.click();
		
		

		
	}

}
