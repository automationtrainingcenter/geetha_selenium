package webtables_and_calenders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.BrowserHelper;

public class CalendarDemo extends BrowserHelper {

	public static void selectDate(String desiredDate, WebElement tBody, WebDriver driver) {
		// relocate tbody and rows because by clicking > symbol page has been reloaded
		tBody = driver.findElement(By.cssSelector("#rb-calendar_onward_cal tbody"));
		List<WebElement> rows = tBody.findElements(By.tagName("tr"));
		boolean flag = false;
		// iterate over every row
		for (int i = 2; i < rows.size(); i++) {
			// locate cells inside the every row
			List<WebElement> dates = rows.get(i).findElements(By.tagName("td"));
			// iterate over the dates
			for (WebElement date : dates) {
				// get the inner text of the date and compare with desired date
				if (date.getText().equals(desiredDate)) {
					// click on that date
					date.click();
					flag = true;
					break; // breaks the dates loop
				}
			}
			if (flag) {
				break; // breaks the rows loop
			}
		}

	}

	public static void main(String[] args) {
		WebDriver driver = openBrowser("chrome", "https://www.redbus.in/");
		sleep(3000);
		// locate onward date field and click on it
		driver.findElement(By.cssSelector("label[for='onward_cal']")).click();
		// to select a date in next month click on > button in first row

		// locate calendar table body
		WebElement tBody = driver.findElement(By.cssSelector("#rb-calendar_onward_cal tbody"));
		// locate all the rows inside the table body
		List<WebElement> rows = tBody.findElements(By.tagName("tr"));
		sleep(2000);
		rows.get(0).findElement(By.xpath(".//td/child::button[text()='>']")).click();
		selectDate("18", tBody, driver);
		sleep(3000);
		closeBroser();
	}
}
