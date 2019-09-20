package webtables_and_calenders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.BrowserHelper;

public class BasicWebTableDemo extends BrowserHelper {
	public static void main(String[] args) {
		WebDriver driver = openBrowser("chrome", "https://learn.letskodeit.com/p/practice");
		// locate web table body element
		WebElement tableBody = driver.findElement(By.cssSelector("#product>tbody"));

		// locate number of rows in the table using tr tag
		List<WebElement> rows = tableBody.findElements(By.tagName("tr"));

		// iterate over each row from second row onwards
		for (int i = 1; i < rows.size(); i++) {
			// locate all columns in every row using td tag
			List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
			// iterate over each column or cell and get the table cell
			for (WebElement cell : cells) {
				System.out.print(cell.getText()+"\t");
			}
			System.out.println();
		}
		closeBroser();
	}

}
