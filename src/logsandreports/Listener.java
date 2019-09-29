package logsandreports;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.JavaScriptHelper;

public class Listener extends BaseClass implements WebDriverEventListener{
//	ExtentTest test;
//	
//	public Listener(ExtentTest test) {
//		this.test = test;
//	}

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		System.out.println("alert accepted");
		test.log(LogStatus.INFO, "alert accepted");
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		System.out.println("alert dismissed");
		test.log(LogStatus.INFO, "alert dismissed");
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("element value changed to "+JavaScriptHelper.getElementText(arg1, arg0));
		test.log(LogStatus.INFO, "element value changed to "+JavaScriptHelper.getElementText(arg1, arg0));
	}
	

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("clicked on element");
		test.log(LogStatus.INFO, "clicked on element");
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("element located sucessfully");
		test.log(LogStatus.INFO, "element located sucessfully");
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		
	}

	@Override
	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		System.out.println("element text is "+arg2);
		test.log(LogStatus.INFO, "element text is "+arg2);
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("navigated to "+arg0);
		test.log(LogStatus.INFO, ("navigated to "+arg0));
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		
	}

	@Override
	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		System.out.println("driver focue switched to window"+arg1.getTitle());
		test.log(LogStatus.INFO,"driver focus switched to window"+arg1.getTitle());
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		System.out.println("alert came with message as "+arg0.switchTo().alert().getText());
		test.log(LogStatus.INFO, "alert came with message as "+arg0.switchTo().alert().getText());
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		System.out.println("alert came with message as "+arg0.switchTo().alert().getText());
		test.log(LogStatus.INFO, "alert came with message as "+arg0.switchTo().alert().getText());
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("changing elmenet value");
		test.log(LogStatus.INFO, "changing elmenet value");
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("clicking on element");
		test.log(LogStatus.INFO, "clicking on element");
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("locating an element using "+arg0);
		test.log(LogStatus.INFO,"locating an element using "+arg0);
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		
	}

	@Override
	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		System.out.println("retrieving element text");
		test.log(LogStatus.INFO, "retrieving element text");
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("navigating to "+arg0);
		test.log(LogStatus.INFO, "navigating to "+arg0);
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		
	}

	@Override
	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		System.out.println("switch driver focus from window "+arg1.getTitle());
		test.log(LogStatus.INFO, "switch driver focus from window "+arg1.getTitle());
	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		System.out.println("got an execption i.e. "+arg0.getClass().getName());
		System.out.println("exception message is "+arg0.getMessage());
		test.log(LogStatus.INFO, "exception message is "+arg0.getMessage());
	}
	
}
