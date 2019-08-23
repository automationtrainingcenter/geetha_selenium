package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingTechniques {
	/*
	 * findElement() -> is used to locate an element in the web page using locator
	 * information. If the element is not located using the given locator info this
	 * method throws NoSuchElementException.
	 */

	/*
	 * findElements() -> is used to locate multiple elements in the web page using
	 * locator information. This method returns a list of elements. if no element is
	 * not located then this method returns an empty list.
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		/*
		 * Selenium provides 8 ways to locate an element in the current web page These
		 * ways are available as static methods in By class. all these 8 methods in By
		 * class accepts a string arguments and returns a By class reference
		 */

		/*
		 * using id attribute value of an element By eleId = By.id("id attribute value")
		 */
//		By id = By.id("email");
//		WebElement emailField = driver.findElement(id);
		WebElement emailField = driver.findElement(By.id("email"));

		/*
		 * using name attribute value of an element By eleName =
		 * By.name("name attribute value")
		 */
		By name = By.name("firstname");
		WebElement firstNameField = driver.findElement(name);

		/*
		 * using linkText of a link linkeText in an inner text in between opening <a>
		 * and closing</a> anchor tags eg: <a>link text</a> By eleLinkText =
		 * By.linkText("link text of element")
		 */
		By linkText = By.linkText("Forgotten account?");
		WebElement forgottenPassLink = driver.findElement(linkText);
		
		/*
		 * using part of the link text instead of complete link text By
		 * elePartialLinkText = By.partialLinkText("part of the link text")
		 */
		By partialLinkText = By.partialLinkText("Market");
		WebElement marketpalceLink = driver.findElement(partialLinkText);
		
		/*
		 * using css selector of a element Xpath and cssSelectors are used to locate an
		 * element using any attribute value basic syntax to write css is syntax:
		 * tagname[attribute_name = 'attribute_value']
		 */

		/*
		 * using xpath of an element basic syntax to write xpath is syntax:
		 * //tag_name[@attribute_name = 'attribute_value']
		 */

		/*
		 * if we locating element using className or tagName then, there might high
		 * probability to locate multiple elements instead of single element
		 */

		/*
		 * using class name of a element in general class attribute contains several
		 * class names, so to locate element using class name we have to use one these
		 * class names instead of complete class attribute value eg: class = 'class1
		 * class2 class3' above class attribute contains 3 classes separated by space
		 * syntax: By.className('class1')
		 */

		/*
		 * using tag name of the element
		 */
	}

}
