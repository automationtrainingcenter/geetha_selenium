package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		// locate an element in the page
		WebElement firstName = driver.findElement(By.name("firstname"));
		
		// sendKeys(String arg) - is used to type some data in the text field or text area
		firstName.sendKeys("sunshine");
//		driver.findElement(By.name("firstname")).sendKeys("sunshine");
		Thread.sleep(3000);
		
		// clear() - is used to remove exsiting data from any text field or text area
		firstName.clear();
		Thread.sleep(3000);
		
		// click() - is used to click on any element in the page
		driver.findElement(By.cssSelector("input[value='1']")).click();
		Thread.sleep(3000);
		
		WebElement signupButton = driver.findElement(By.name("websubmit"));
		signupButton.click();
		Thread.sleep(3000);
		
		// submit() - is used to submit form to server from any element
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("sunshine");
		Thread.sleep(3000);
//		emailField.submit();
//		Thread.sleep(3000);
		
		
		// getText() - is used to retrieve the inner text of the givem element if any
		// inner text means the text in between opening and close tag
		String singUpText = signupButton.getText();
		System.out.println(singUpText);
		
		// getAttribute(String attName) - is used to retrieve value of the given attribute
		String emailClassAttValue = emailField.getAttribute("class");
		System.out.println("class attribute value is "+emailClassAttValue);
		
		// getTagName() - is used retrieve the tag name of the given element
		String signUpBtnTagName = signupButton.getTagName();
		System.out.println("sign up button tag name is "+signUpBtnTagName);
		
		
		// getCssValue(String cssProperty) - is used to retrieve the value of the given css property of a element
		String emailFieldFontSize = emailField.getCssValue("font-size");
		System.out.println("email field font size is "+emailFieldFontSize);
		
		
		// getSize() - is used to retrieve the size of the given element i.e. width and height of hte element
		Dimension size = signupButton.getSize();
		System.out.println("sign up button height is "+size.getHeight()+" width is "+size.getWidth());
		
		// getLocation() - is used to retrieve the location of the element from the top left cornor of the page
		Point location = signupButton.getLocation();
		System.out.println("sing up button is at x = "+location.getX()+" y = "+location.getY());
		
		
		driver.close();
	}

}
