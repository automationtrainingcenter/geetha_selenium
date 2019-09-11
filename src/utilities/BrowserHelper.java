package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserHelper {

	static WebDriver driver;
	/*
	 * openBrowser will lauch the browser based on the browser name we specified and 
	 * returns WebDriver object reference
	 */
	public static WebDriver openBrowser(String browserName, String url) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			throw new RuntimeException("Invalid browser Name, Browser name must be either chrome or firefox");
		}
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

	/*
	 * closeBrowser will close browser windows or window opened by the driver instance
	 */
	public static void closeBroser() {
		if (driver.getWindowHandles().size() > 1) {
			driver.quit();
		} else {
			driver.close();
		}
	}
}
