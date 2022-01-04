package selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDropBy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Razan\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement sourcElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		int x = targetElement.getRect().getX();
		int y = targetElement.getRect().getY();
		
		action.dragAndDropBy(sourcElement, x, y).build().perform();
		
	}

}
