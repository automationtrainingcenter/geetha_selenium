package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownlistDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		/*
		 * To automate dropdown list or list box selenium provides Select class 
		 * 1.Create an Object of Select class by passing WebElement as argument to
		 * constructor
		 */
		
		// locate day drop down list
		WebElement dayElement = driver.findElement(By.id("day"));
		
		// create Select class object
		Select daySelect = new Select(dayElement);
		
		// selecting an option based based on index number
		daySelect.selectByIndex(1);
		Thread.sleep(2000);
		
		// locate month drop down list
		WebElement monthElement = driver.findElement(By.id("month"));
		
		// createa Select class object
		Select monthSelect = new Select(monthElement);
		
		// selecting an option based on the value of the value attribute of the option
		monthSelect.selectByValue("11");
		Thread.sleep(2000);
		
		
//		// locate year drop down list
//		WebElement yearElement = driver.findElement(By.id("year"));
//		
//		//create Select class object
//		Select yearSelect = new Select(yearElement);
		Select yearSelect = new Select(driver.findElement(By.id("year")));
		
		//selecting an option based on visible text (i.e. inner text of the <option> and </option>)
		yearSelect.selectByVisibleText("2000");
		Thread.sleep(2000);
		
		
		driver.close();
		
		
	}

}
