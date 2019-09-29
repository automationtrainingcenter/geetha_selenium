package logsandreports;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
/*
 * WebDriverEventListener is an interface 
 * 1. create a class which will implement WebDriverEventListener interface 
 * 2. create an object of Listener class of first step.
 * 3. create an object of EventFiringWebDriver class
 * 4. register listener class with EventFiringWebDriver
 */

public class LogsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// create an object of Listener class
//		Listener listener = new Listener();
//		// create an object of EventFiringWebDriver class
//		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
//		edriver.register(listener);
//		
//		edriver.get("https://learn.letskodeit.com/p/practice");
//		edriver.findElement(By.id("name")).sendKeys("sunshine");
//		edriver.findElement(By.id("alertbtn")).click();
//		edriver.switchTo().alert().accept();
//		edriver.findElement(By.id("openwindow")).click();
//		List<String> handles = new ArrayList<>(edriver.getWindowHandles());
//		edriver.switchTo().window(handles.get(1));
//		edriver.findElement(By.id("header-sign-up-btn")).getText();
//		edriver.switchTo().window(handles.get(0));
//		edriver.findElement(By.id("hondaradio")).click();
//		edriver.close();
		
		

	}

}
