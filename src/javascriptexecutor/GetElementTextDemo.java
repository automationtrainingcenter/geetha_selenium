package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.BrowserHelper;
import utilities.JavaScriptHelper;

public class GetElementTextDemo extends BrowserHelper{

	public static void main(String[] args) {
		WebDriver driver = openBrowser("chrome", "http://www.facebook.com");
		
		// locate the text field
		WebElement firstNameEle = driver.findElement(By.name("firstname"));
//		firstNameEle.sendKeys("sunshine");
		
		
		/*
		 * To execute javascript Selenium provides JavaScriptExecutor interface
		 * which is implemented by RemoteWebDriver.
		 * typecast WebDriver object to JavaScriptExecutor object to call it's methods
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// set the value to first name element
		js.executeScript("arguments[0].value = arguments[1]", firstNameEle, "surya");
		sleep(2000);
		
		// retrieve the text of first name element
		String firstNameValue = js.executeScript("return arguments[0].value", firstNameEle).toString();
		System.out.println("first name field value is "+firstNameValue);
		
		// retrieve the text of first name elemnet using JavaScriptHelper class
		String firstNameText = JavaScriptHelper.getElementText(driver, firstNameEle);
		System.out.println(firstNameText);
		closeBroser();
	}

}
