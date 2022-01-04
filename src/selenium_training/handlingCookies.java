package selenium_training;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingCookies {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AL THEQA\\Desktop\\QA\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://example.com/some404page/");
		Cookie testCookie = new Cookie("test cookie key","test cookie value");
		driver.manage().addCookie(testCookie);
		String cookieValue = driver.manage().getCookieNamed("test cookie key").getValue();
		System.out.println(cookieValue);
		
		Cookie testCookie2 = new Cookie("test cookie key2","test cookie value2");
		driver.manage().addCookie(testCookie2);
		
		Cookie testCookie3 = new Cookie("test cookie key3","test cookie value3");
		driver.manage().addCookie(testCookie3);
		
		Set<Cookie> cookiesSet = driver.manage().getCookies();
		//System.out.println(cookiesSet);
		
		driver.manage().deleteCookieNamed("test cookie key2");
		cookiesSet = driver.manage().getCookies();
		//System.out.println(cookiesSet);
		
		String test = testCookie3.getValue();
		System.out.println(test);
		
		for(Cookie cookie : cookiesSet) {
			System.out.println(cookie.getDomain());
		}
	}

}
