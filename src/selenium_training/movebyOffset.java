/**
 * 
 */
package selenium_training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Razan
 *
 */
public class movebyOffset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Razan\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kooora.com");
		driver.manage().window().maximize();
		
		// not used alot 
		
		
		
	}

}
