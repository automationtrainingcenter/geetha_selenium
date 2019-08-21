package basics;
/*
 * To launch any browser create an object of browser driver class
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) throws InterruptedException {
		// create path variable variable 
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		// launch chrome browser
//		ChromeDriver cdriver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(4000);
		
		// close the browser
		driver.close();
		
		
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		// launch firefox browser
		driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(3000);
		driver.close();
		
	}

}
