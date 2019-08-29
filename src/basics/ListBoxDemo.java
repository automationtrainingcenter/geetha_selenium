package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		
		// select options
		// locate list box
		WebElement fruitsEle = driver.findElement(By.id("multiple-select-example"));
		// create Select class object
		Select fruitsSelect = new Select(fruitsEle);
		
		// get default selected fruit option
		WebElement firstSelectedOption = fruitsSelect.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		// retrieve all the options
		List<WebElement> options = fruitsSelect.getOptions();
		System.out.println("number of fruit options available are "+options.size());
		
		// verify fruitsSelect is list box or not
		System.out.println("fruit select allows mulitple options selection "+fruitsSelect.isMultiple());
		
		// select an option based on index
		fruitsSelect.selectByIndex(2);
		Thread.sleep(1000);
		
		
		// select an option based on value
		fruitsSelect.selectByValue("apple");
		Thread.sleep(1000);
		
		// get all selected options
		List<WebElement> allSelectedOptions = fruitsSelect.getAllSelectedOptions();
		System.out.println("number of selected options is "+allSelectedOptions.size());
		
		// select an option based on visible text
		fruitsSelect.selectByVisibleText("Orange");
		Thread.sleep(1000);
		
		// deselect all the options
//		fruitsSelect.deselectAll();
//		Thread.sleep(2000);
		
		// deselect an option based on index
		fruitsSelect.deselectByIndex(1);
		Thread.sleep(1000);
		
		// deselect an option based on value
		fruitsSelect.deselectByValue("peach");
		Thread.sleep(1000);
		
		// deselect an option based on visible text
		fruitsSelect.deselectByVisibleText("Apple");
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		
		
	}

}
