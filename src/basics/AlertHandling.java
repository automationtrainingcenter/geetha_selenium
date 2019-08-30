package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To handle alerts or JavaScript popups Selenium provides
 * Alert Interface. In this interface we have
 * accept() which will click on ok button of the alert
 * dismiss() which will click on cancel button of the alert
 * sendKeys(String arg) which will type some data in an alert text field
 * getText() return String value i.e. text of the alert
 * 
 * To automate these alerts, first of all switch driver focus from the web page to alert
 * In WebDriver interface we have switchTo() which will return TargetLocator interface refernce
 * In TargetLocator interface we have alert() which will return Alert interface reference
 */
public class AlertHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		String name = "surya";
		
		// locate enter your name text field
		WebElement nameTextfield = driver.findElement(By.id("name"));
		
		// fill text field with name
		nameTextfield.sendKeys(name);
		Thread.sleep(1000);
		
		// locate alert button and click on it
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(1000);
		
		// switch the driver focus to the alert
//		TargetLocator tl = driver.switchTo();
//		Alert alert = tl.alert();
		Alert alert = driver.switchTo().alert();
		
		// get the text of alert
		String alertText = alert.getText();
		
		//click on OK button of the alert using accept() of Alert interface
		alert.accept();
		Thread.sleep(1000);
		
		if(alertText.contains(name)) {
			System.out.println("test case passed");
		}else {
			System.out.println("test case failed");
		}
		
		// enter name once again in name text field
		nameTextfield.sendKeys(name);
		Thread.sleep(1000);
		
		// locate confirm button and click on it
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(1000);
		
		// switch the driver focus to alert
		Alert confirmAlert = driver.switchTo().alert();
		
		// get the text of confirm alert
		String confirmAlertText = confirmAlert.getText();
		
		// click on cancel button of confirm alert using dismiss() of Alert interface
		confirmAlert.dismiss();
		Thread.sleep(1000);
		
		if(confirmAlertText.contains(name)) {
			System.out.println("confirm alert test case passed");
		}else {
			System.out.println("confrim alert test case failed");
		}
		
		driver.close();
	}

}
