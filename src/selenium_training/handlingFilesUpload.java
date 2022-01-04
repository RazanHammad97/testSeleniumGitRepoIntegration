package selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingFilesUpload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AL THEQA\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://demo.guru99.com/test/upload/");
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement uploadelm = driver.findElement(By.id("file-upload"));
		uploadelm.sendKeys("C:\\Users\\AL THEQA\\eclipse-workspace\\.metadata\\.log");
		
		//WebElement acceptbtn = driver.findElement(By.id("terms"));
		//acceptbtn.click();
		
		WebElement submitBtn = driver.findElement(By.id("file-submit"));
		submitBtn.click();
		
	}

}
