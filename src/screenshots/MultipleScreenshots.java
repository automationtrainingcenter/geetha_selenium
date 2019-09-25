package screenshots;

import org.openqa.selenium.WebDriver;

import utilities.BrowserHelper;
import utilities.ScreenshotHelper;

public class MultipleScreenshots extends BrowserHelper {

	public static void main(String[] args) {
		WebDriver driver = openBrowser("chrome", "http://www.amazon.in");
		sleep(2000);

//		long scrollHeight = (long) JavaScriptHelper.executeJavaScript(driver, "return document.documentElement.scrollHeight");
//		long clientHeight = (long) JavaScriptHelper.executeJavaScript(driver, "return document.documentElement.clientHeight");
//		
////		System.out.println("scroll height = "+scrollHeight+"\nclient height = "+clientHeight);
//		while(scrollHeight > 0) {
//			ScreenshotHelper.screenCapture(driver, "screenshots", "amazon");
//			JavaScriptHelper.scrollPageBy(driver, (int)clientHeight);
//			scrollHeight -= clientHeight;
//			sleep(1000);
//		}

		ScreenshotHelper.takeMultipleScreenshots(driver, "screenshots", "amazon");

		closeBroser();
	}

}
