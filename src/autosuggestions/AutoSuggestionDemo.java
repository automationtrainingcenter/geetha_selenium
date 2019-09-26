package autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.BrowserHelper;

public class AutoSuggestionDemo extends BrowserHelper{
	
	public static void main(String[] args) {
		WebDriver driver = openBrowser("chrome", "http://www.google.com");
		// locate search field and search for something
		driver.findElement(By.name("q")).sendKeys("pycharm");
		sleep(2000);
		// locate an ul tag which contains all the suggestions
		WebElement suggestionsListBox = driver.findElement(By.className("erkvQe"));
		// locate all the li tags inside that ul tag
		List<WebElement> suggestions = suggestionsListBox.findElements(By.tagName("li"));
		for(WebElement suggestion : suggestions) {
			String suggestionText = suggestion.getText();
			if(suggestionText.equals("pycharm download")) {
				suggestion.click();
				break;
			}
		}
		sleep(2000);
		closeBroser();
	}

}
