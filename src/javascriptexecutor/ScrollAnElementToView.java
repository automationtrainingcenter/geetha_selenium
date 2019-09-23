package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.BrowserHelper;
import utilities.JavaScriptHelper;

public class ScrollAnElementToView extends BrowserHelper{
	public static void main(String[] args) {
		WebDriver driver = openBrowser("chrome", "http://www.amazon.in");
		//locate back to top element
		WebElement backToTopEle = driver.findElement(By.id("navBackToTop"));
		// bring back to top element into the view
		// typecast WebDriver object reference to JavaScriptExecutor object reference
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView()", backToTopEle);
		JavaScriptHelper.bringElementToView(driver, backToTopEle);
		sleep(2000);
		
		// scrollup the web page
//		js.executeScript("document.documentElement.scrollBy(0, arguments[0])", -150);
		JavaScriptHelper.scrollPageBy(driver, -150);
		sleep(2000);
		backToTopEle.click();
		sleep(2000);
		closeBroser();
		
	}

}
