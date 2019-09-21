package mouseautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utilities.BrowserHelper;

public class DragAndDropDemo extends BrowserHelper {
	public static void main(String[] args) {
		WebDriver driver = openBrowser("chrome", "https://jqueryui.com/droppable/");
		sleep(2000);
		// switch to frame which contains drag and drop elements
		driver.switchTo().frame(0);
		// now focus is inside the frame
		// locate drag element
		WebElement dragEle = driver.findElement(By.id("draggable"));
		// locate drop element
		WebElement dropEle = driver.findElement(By.id("droppable"));
		// create Actions class object
		Actions actions = new Actions(driver);
		// drag element and drop it on drop element
//		actions.clickAndHold(dragEle).moveToElement(dropEle).release().build().perform();
		actions.dragAndDrop(dragEle, dropEle).build().perform();
		sleep(3000);
		closeBroser();

	}

}
