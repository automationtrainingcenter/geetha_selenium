package logsandreports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/*This class explains how to work with extent reports 2, here we are taking some dummy test cases
to explain the extent reports features.
Extent report mainly provides two classes to generate the reports
1. ExtentReports -- which will create the report with a given name and location and
   starts and ends tests
2. ExtentTest -- which will used to log some info to the report
*/

public class ReportDemo {
	EventFiringWebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	public void launchBrowser() {
		//2. start the test using ExtentReports class object which creates ExtentTest object
		test = report.startTest("launch browser");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver wdriver = new ChromeDriver();
		wdriver.manage().window().maximize();
		
		Listener listener = new Listener();
		driver = new EventFiringWebDriver(wdriver);
		driver.register(listener);
		
		driver.get("http://primusbank.qedgetech.com/home.aspx");
		//3. end the test case using endTest() of ExtentReports class this methdo accetp
		// ExtentTest object we created in step2
		test.log(LogStatus.PASS, "launch browser test is passed");
		report.endTest(test);
	}
	
	public void invalidLogin() {
		test = report.startTest("invalid login");
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Adminmnmjgf");
		driver.findElement(By.id("login")).click();
		driver.switchTo().alert().accept();
		test.log(LogStatus.PASS, "invalid login passed");
		report.endTest(test);
	}
	
	public void validLogin() {
		test = report.startTest("valid login");
		WebElement username = driver.findElement(By.id("txtuId"));
		username.clear();
		username.sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		test.log(LogStatus.FAIL, "valid login passed");
		report.endTest(test);
	}

	
	public void closeBrowser() {
		test = report.startTest("close browser");
		driver.findElement(By.cssSelector("a[href='http://primusbank.qedgetech.com']")).click();
		driver.close();
		test.log(LogStatus.PASS, "close browser passed");
		report.endTest(test);
	}
	
	public static void main(String[] args) {
		ReportDemo obj = new ReportDemo();
		//1. create an object of ExtentReports class 
		obj.report = new ExtentReports(".\\reports\\report.html");
		obj.launchBrowser();
		obj.invalidLogin();
		obj.validLogin();
		obj.closeBrowser();
		// 4. save the report by using flush() of ExtentReports class
		obj.report.flush();
		// 5. close ExtentReports class object
		obj.report.close();
		
		
	}
}
