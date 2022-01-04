package selenium_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class toolTip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Razan\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://jqueryui.com/tooltip");
		driver.get("http://demo.guru99.com/test/tooltip.html");
//		driver.manage().window().maximize();
//		
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src=\"/resources/demos/tooltip/default.html\"]")));
//		WebElement ageElement = driver.findElement(By.id("age"));
//		String ExpectedResult = "We ask for your age only for statistical purposes.";
//		
//		String ActualResult = ageElement.getAttribute("title");
//		
//		if(ExpectedResult.equals(ActualResult)) {
//			System.out.println("Passed");
//		}
//		
//		else {
//			System.out.println("Failed");
//		}
		
		WebElement elementDownloadBtn = driver.findElement(By.id("download_now"));
		Actions action = new Actions(driver);
		action.clickAndHold(elementDownloadBtn).moveToElement(elementDownloadBtn).build().perform();
		//action.clickAndHold(elementDownloadBtn).moveToElement(elementDownloadBtn).build().perform();
		
		WebElement tooltip = driver.findElement(By.cssSelector("div.tooltip>a"));
		System.out.println(tooltip.getText());
		
	}

}
