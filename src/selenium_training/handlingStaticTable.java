package selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingStaticTable {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Razan\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		//WebElement cell = driver.findElement(By.xpath("//table[@width=\"277\"]/tbody/tr[3]/td[2]\r\n"));
		WebElement cell = driver.findElement(By.xpath("//table/tbody/tr/td[2]/"+"table/tbody/tr[4]/td/"+"table/tbody/tr/td[2]/"
				+ "table/tbody/tr[2]/td[1]/"+"table[2]/tbody/tr[3]/td[2]/font"));
		System.out.println(cell.getText());
		
		

	}

}
