package mouseautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.BrowserHelper;

public class DragElementDemo extends BrowserHelper{
	public static void main(String[] args) {
		WebDriver driver = openBrowser("chrome", "https://jqueryui.com/draggable/");
		sleep(2000);
		// switch to frame which contains drag element
		driver.switchTo().frame(0);
		// now focus is in frame
		// locate drag element
		WebElement dragEle = driver.findElement(By.id("draggable"));
		// create an object of Actions class
		Actions actions = new Actions(driver);
//		actions.clickAndHold(dragEle).moveByOffset(150, 100).release().build().perform();
		actions.dragAndDropBy(dragEle, 150, 100).build().perform();
		sleep(2000);
		closeBroser();
	}

}
