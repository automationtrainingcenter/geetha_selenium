package mouseautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.BrowserHelper;

public class MouseHoverDemo extends BrowserHelper{
	public static void main(String[] args) {
		WebDriver driver = openBrowser("chrome", "https://www.hdfcbank.com/");
		sleep(3000);
		/*
		 * To automate mouse events Selenium provides Actions class
		 * In this class we have several methods to perform mouse related events
		 * What ever the action we are performing on any element using Actions class,
		 * we have to build and perform that action. here build and perform are methods 
		 * in actions class
		 */
		// locate Products link
		WebElement ProductsLink = driver.findElement(By.linkText("Products"));
		// create an Object of Actions class
		Actions actions = new Actions(driver);
		// move to products link
		// moveToElement() is used to move mouse to an element
		actions.moveToElement(ProductsLink).build().perform();
		sleep(2000);
		// locate loans link
		WebElement loansLink = driver.findElement(By.linkText("Loans"));
		actions.moveToElement(loansLink).build().perform();
		sleep(2000);
		// locate car loans link 
		WebElement carLoansLink = driver.findElement(By.linkText("Car Loans"));
		// move mouse to car loans link and click on it
		actions.moveToElement(carLoansLink).click().build().perform();
		sleep(2000);
		closeBroser();
	}
}
