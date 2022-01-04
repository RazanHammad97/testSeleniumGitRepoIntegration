package selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingStaticTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Razan\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		
	//	WebElement cell = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")); // forth cell
		WebElement cell = driver.findElement(By.xpath("//table/tbody/tr/td[2]")); //second sell
		System.out.println(cell.getText());
		

	}

}
