package selenium_training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskTableSession {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Razan\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nyse.com/ipo-center/filings");
		driver.manage().window().maximize();
		
		List<WebElement> dealsFieldRows = driver.findElements(By.xpath("//table[3]/tbody/tr"));
		System.out.println("Rows:"+dealsFieldRows.size());
		
		List<WebElement> dealsFieldColons = driver.findElements(By.xpath("//table[3]/thead/tr/th"));
		System.out.println("Rows:"+dealsFieldColons.size());
		
		WebElement cell = driver.findElement(By.xpath("//table[3]/tbody/tr[4]/td[3]/strong"));
		System.out.println(cell.getText());
		
		
		
		
	}

}
