package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		// launch chrome browser
		ChromeDriver cdriver = new ChromeDriver();
		
		cdriver.get("http://www.facebook.com");
		Thread.sleep(3000);
		System.out.println(cdriver.getTitle());
		WebElement emailEle = cdriver.findElement(By.id("email"));
		emailEle.sendKeys("sunshine");
		
		WebElement loginButton = cdriver.findElement(By.id("loginbutton"));
		loginButton.click();
		
		
	}

}
