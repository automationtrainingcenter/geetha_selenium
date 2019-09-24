package screenshots;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utilities.BrowserHelper;

public class ScreenshotDemo extends BrowserHelper{
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = openBrowser("chrome", "http://www.facebook.com");
		sleep(2000);
		/*
		 * To capture the screenshot of a web page selenium provides getScreenshotAs()
		 * of TakeScreenshot interface
		 */
		//create a TakeScreenshot interface object reference by converting WebDriver object
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcImg = ts.getScreenshotAs(OutputType.FILE);
		File destImg = new File(".//screenshots//image3.png");
		// java inbuilt approach to save the image
//		BufferedImage bi = ImageIO.read(srcImg);
//		ImageIO.write(bi, "png", destImg);
		
		// using FileUtils class apache commons io jar
		// download commons.io jar file from https://commons.apache.org/proper/commons-io/download_io.cgi
		// associate commons-io-2.6.jar to project build path
		FileUtils.copyFile(srcImg, destImg);
		closeBroser();
		
		
	}

}
