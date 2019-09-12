package webtables_and_calenders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.BrowserHelper;

public class NseIndiaOne extends BrowserHelper {

	public static void main(String[] args) {
		String ccode = "NTPC";
		WebDriver driver = openBrowser("chrome", "https://www.nse-india.com/live_market/dynaContent/live_watch/pre_open_market/pre_open_market.htm");
		// locate table body and store in a variable
		WebElement tbody = driver.findElement(By.cssSelector("#preOpenNiftyTab>tbody"));
		// locate all the rows inside the table body
		List<WebElement> rows = tbody.findElements(By.tagName("tr"));
		// iterate over rows
		for(int i =2; i < rows.size(); i++) {
			// locate cells inside every row
			List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
			if(cells.get(0).getText().equals(ccode)) {
				String sharePrice = cells.get(3).getText();
				System.out.println("share price of "+ccode+" is "+sharePrice);
				break;
			}
		}
		closeBroser();
	}

}
