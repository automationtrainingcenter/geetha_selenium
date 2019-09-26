package sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import utilities.BrowserHelper;

public class FileUploadDemo extends BrowserHelper{
	
	public static void main(String[] args) {
		WebDriver driver = openBrowser("chrome", "https://smallpdf.com/word-to-pdf");
		driver.findElement(By.xpath("//div[text()='Choose file']")).click();
		sleep(2000);
		//create Pattern class objects
		Pattern file = new Pattern("D:\\SSTS\\geetha\\selenium_concepts\\images\\file.PNG");
		Pattern open = new Pattern("D:\\SSTS\\geetha\\selenium_concepts\\images\\open.PNG");
		
		// create a Screen class object
		Screen screen = new Screen();
		try {
			screen.find(file);
			screen.type(file, "D:\\selenium\\Notes\\sql.doc");
			screen.find(open);
			screen.click(open);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sleep(3000);
		closeBroser();
	}

}
