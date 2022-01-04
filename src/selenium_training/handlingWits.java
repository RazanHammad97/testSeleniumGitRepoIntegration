package selenium_training;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handlingWits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AL THEQA\\Desktop\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/ExpectedConditions.html");
		driver.manage().window().maximize();
		// wait until the web element visibility too do an action
		//WebElement wait = new WebDriverWait(driver, Duration.ofMillis(5000)).until(ExpectedConditions.visibilityOf(""));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000)); //not recomended 
		// explicit wait is cancelled when condition targeted
	}

}
