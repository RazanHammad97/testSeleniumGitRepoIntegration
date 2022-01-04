package selenium_training;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium_realJavaWorldApp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Razan\\Desktop\\QA\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:3000/");
		driver.manage().window().maximize();
		
		WebElement submitLink = driver.findElement(By.cssSelector("a[href=\"/signup\"]"));
		//submitLink.click();
		submitLink.click();
		
		WebElement fname = driver.findElement(By.id("firstName"));
		//fname.click();
		fname.sendKeys("Razan");
		
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("Hammad");
		
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("razan7");
		
		String pass = "12345678";
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pass);
		
		WebElement confirmpassword = driver.findElement(By.id("confirmPassword"));
		confirmpassword.sendKeys(pass);
		
		WebElement submitbtn = driver.findElement(By.cssSelector("button[data-test=\"signup-submit\"]"));
		submitbtn.click();
		
		boolean isUrlChanged = new WebDriverWait(driver,Duration.ofSeconds(5))
				.until(ExpectedConditions.urlContains("signin"));
		
		WebElement usernamesignin = driver.findElement(By.id("username"));
		usernamesignin.click();
		usernamesignin.sendKeys("razan7");
		
		WebElement passlogin = driver.findElement(By.id("password"));
		passlogin.sendKeys(pass);
		
		WebElement loginbtn = driver.findElement(By.cssSelector("button[data-test=\"signin-submit\"]"));
		loginbtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("div[data-test=\"user-onboarding-dialog\"]")));

		WebElement nextBtn = driver.findElement(By.cssSelector("button[data-test=\"user-onboarding-next\"]"));
		nextBtn.click();

		WebElement bankName = driver.findElement(By.id("bankaccount-bankName-input"));
		bankName.sendKeys("Palestine");

		WebElement routingNumber = driver.findElement(By.id("bankaccount-routingNumber-input"));
		routingNumber.sendKeys("222222222");

		WebElement accountNum = driver.findElement(By.id("bankaccount-accountNumber-input"));
		accountNum.sendKeys("2222222222");

		WebElement saveBtn = driver.findElement(By.cssSelector("button[data-test=\"bankaccount-submit\"]"));
		saveBtn.click();

		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[role=\"dialog\"]")));

		WebElement doneBtn = driver.findElement(By.cssSelector("button[data-test=\"user-onboarding-next\"]"));
		doneBtn.click();
		
    	WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href=\"/transaction/new\"]")));
		
		WebElement newTransactionBtn = driver.findElement(By.cssSelector("a[href=\"/transaction/new\"]"));
		newTransactionBtn.click();
		
		List<WebElement> userList = driver.findElements(By.cssSelector("ul[data-test=\"users-list\"] li"));
		
		Random random_user = new Random();
		userList.get(random_user.nextInt(userList.size())).click();
		
		//WebElement searchBtn = driver.findElement(By.cssSelector("input[data-test=\"user-list-search-input\"]"));
		//searchBtn.sendKeys(user.getText());
		
		WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement amount = driver.findElement(By.id("amount"));

		wait4.until(ExpectedConditions.visibilityOf(amount));
		
		amount.sendKeys("200");
		
		WebElement note = driver.findElement(By.id("transaction-create-description-input"));
		note.sendKeys("note test to requset an amount to random user");
		
		WebElement requestBtn = driver.findElement(By.cssSelector("button[data-test=\"transaction-create-submit-request\"]"));
		requestBtn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
