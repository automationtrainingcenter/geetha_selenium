package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * get ids of all windows opened by driver instance using getWindowHandles() of WebDriver interface
 * getWindowHanldes() returns a Set<String> and convert that set to List<String>
 * In that list index 0 we will have id of main window, index 1 will have id  of first child window
 * , index 2 will id of second child window and so on 
 * to switch the focus from main window to any window use following approach
 * In WebDriver interface we have switchTo() which returns TargetLocator interface
 * In TargerLocator interface we have window(String arg) i.e. id of the child window you want to switch
 */
public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		//locate element in main window which will open multiple windows and click on it
		driver.findElement(By.id("opentab")).click();
		
		// get window ids using getWindowHandles() of WebDriver interface
		Set<String> windowHandles = driver.getWindowHandles();
		// convert that set to list
		List<String> windowIds = new ArrayList<>(windowHandles);
		// now the driver focus is in main window
		// switch that focus first child window
//		TargetLocator tl = driver.switchTo();
//		tl.window(windowIds.get(1));
		driver.switchTo().window(windowIds.get(1));
		
		// now driver focus is in child window
		driver.findElement(By.id("search-courses")).sendKeys("ruby");
		Thread.sleep(2000);
		
		
		// now switch the driver focus back to main window
		driver.switchTo().window(windowIds.get(0));
		
		// now focus is in main window
		driver.findElement(By.id("name")).sendKeys("sunshine");
		Thread.sleep(3000);
		
		// close all browser windows opened by driver instance
		driver.quit();
	}

}
