package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManagementMethods {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*
		 * In WebDriver interface we have an Window inner interface which contains several methods
		 * to manage the browser window
		 * In WebDriver interface we have manage() which will return Options interface reference
		 * In Options interface we have window() which will return Window interface reference
		 * 
		 * Here Options and Window are inner interfaces of WebDriver interface
		 */
		Options options = driver.manage();
		Window window = options.window();
		
		//getSize() - returns a Dimension class object. which is nothing but height and width of
		//the browser window
		Dimension size = window.getSize();
		System.out.println("height = "+size.getHeight()+" width = "+size.getWidth());
		
		//getPosition() - returns a Point class object. which is nothing but x and y coordinate axis 
		// of the browser window from the top left corner of the screen
		Point position = window.getPosition();
		System.out.println("x = "+position.getX()+" y = "+position.getY());
		
		// maximize() : maximizes the browser window if it is not already maximized
		window.maximize();
//		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//fullScreen() : makes the browser window to full Screen mode (F11 mode)
		window.fullscreen();
		Thread.sleep(3000);
		
		
		// setSize(Dimension arg) : it will set the browser window size to given size
//		Dimension d = new Dimension(500, 300);
		window.setSize(new Dimension(500, 300));
		Thread.sleep(3000);
		
		
		// setPosition(Point arg) ; it will set the browser window position to the given position
		Point p = new Point(700, 500);
		window.setPosition(p);
		Thread.sleep(3000);
		
		driver.close();
	}

}
