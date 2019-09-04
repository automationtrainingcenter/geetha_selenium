package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To automate frames, first of all switch driver focus from the web page to frame
 * In WebDriver interface we have switchTo() which will return TargetLocator interface refernce
 * In TargetLocator interface we have below methods to automate frames
 * frame(int arg) --  switch driver focus to Frame with given index number
 * frame(String arg) -- switch driver focus to Frame with given id and name attribute values
 * frame(WebElement arg) -- switch driver focus to Frame with given frame element
 * parentFrame() - switch driver focus from inner frame to parent frame
 * defaultContent() -- switch driver focus from any frame to main page
 */
public class FramesHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		//now driver focus is in main page
		// locate enter your name text field and type some data
		driver.findElement(By.id("name")).sendKeys("sunshine");
		Thread.sleep(2000);
		
		// switch driver focus from main page to frame
		// using index number
//		driver.switchTo().frame(0);
		// using id attribute
//		driver.switchTo().frame("courses-iframe");
		// using name attribute
//		driver.switchTo().frame("iframe-name");
		// using webelemnet reference
		// locate frame we want to switch
		WebElement frameToSwitch = driver.findElement(By.xpath("//iframe[@src='https://learn.letskodeit.com/courses']"));
		driver.switchTo().frame(frameToSwitch);
		// now the driver focus is in frame
		// locate find a course text filed and type some data
		driver.findElement(By.id("search-courses")).sendKeys("ruby");
		Thread.sleep(2000);
		
		// now switch focus back to the main page
		driver.switchTo().defaultContent();
		// now focus is in the main page
		// locate hide/show text field and enter some data
		driver.findElement(By.id("displayed-text")).sendKeys("surya");
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}
}
