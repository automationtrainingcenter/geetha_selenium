package screenshots;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.BrowserHelper;

public class AlertScreenshot extends BrowserHelper{
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = openBrowser("chrome", "https://learn.letskodeit.com/p/practice");
		sleep(2000);
		// locate alert button and click on it so that it will open an alert in the page
		driver.findElement(By.id("alertbtn")).click();
		
		// now we have an alert in the page
		// so capture the screenshot of that alert
		// selenium provided TakeScreenshot interface can not capture the alert screenshots
		// we have to Robot class of Java
		Robot r = new Robot();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(dim);
		BufferedImage bi = r.createScreenCapture(rect);
		File destImg = new File(".//screenshots//alertImage.png");
		ImageIO.write(bi, "png", destImg);
		
		// switch the driver focus to alert and close the alert
		driver.switchTo().alert().accept();
		closeBroser();
	}

}
