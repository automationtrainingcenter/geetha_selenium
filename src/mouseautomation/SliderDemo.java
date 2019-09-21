package mouseautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.BrowserHelper;

public class SliderDemo extends BrowserHelper {
	public static void main(String[] args) {
		WebDriver driver = openBrowser("chrome",
				"https://www.axisbank.com/retail/calculators/personal-loan-emi-calculator");
		sleep(3000);
		// locate slider head
		WebElement sliderHead = driver.findElement(
				By.xpath("//input[@id='loanAmtSlider']/preceding-sibling::span//span[@class='irs-single']"));
		// create Actions class object
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(sliderHead, 100, 0).build().perform();
		sleep(2000);
		closeBroser();
	}

}
