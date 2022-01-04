package selenium_training;

import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableTask2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Razan\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nyse.com/ipo-center/filings");
		driver.manage().window().maximize();
		
		//List<WebElement> dealsFieldRows = driver.findElements(By.xpath("//table[3]/tbody/tr"));
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[3]/tbody/tr"));
		
		//System.out.println("Rows:"+maxValue.size());
		
		int i= 0, j=0, max=0;
		for(int RowNumber=1; RowNumber<=rows.size(); RowNumber++) {
		String col=driver.findElement(By.xpath("//*/table[3]/tbody/tr["+RowNumber+"]/td[7]")).getText();
		col=col.replace(",", "").trim();
		//System.out.println(col);
		i=Integer.parseInt(col);
		if(i>j){
		max=j=i;
		}	
		}
		System.out.println("Max current ammount deal Is:"+max);
		
		System.out.println("=============================");
		System.out.println("=============================");
		System.out.println("=============================");
		System.out.println("=============================");
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[3]/tbody/tr")); 

		for (WebElement row : allRows) { 
		    List<WebElement> cells = row.findElements(By.tagName("td")); 

		    for (WebElement cell : cells) {         

		    System.out.println(cell.getText());
		    
		}
	}

}}
