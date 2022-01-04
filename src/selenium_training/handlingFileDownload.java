package selenium_training;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingFileDownload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AL THEQA\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://demo.guru99.com/test/yahoo.html");
		driver.get("https://the-internet.herokuapp.com/download");
		driver.manage().window().maximize();
		
		WebElement downloadButton = driver.findElement(By.cssSelector("a[href=\"download/demo1.txt\"]"));
		        String sourceLocation = downloadButton.getAttribute("href");
		        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

		        try {
		        Process exec = Runtime.getRuntime().exec(wget_command);
		        int exitVal = exec.waitFor();
		        System.out.println("Exit value: " + exitVal);
		        } catch (InterruptedException | IOException ex) {
		        System.out.println(ex.toString());
		        }
		        //driver.close(); // make connection reset 
		        }
		
	}


