package logsandreports;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import utilities.JavaScriptHelper;

public class Listener implements WebDriverEventListener{

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		System.out.println("alert accepted");
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		System.out.println("alert dismissed");
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("element value changed to "+JavaScriptHelper.getElementText(arg1, arg0));
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("clicked on element");
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("element located sucessfully");
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		
	}

	@Override
	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		System.out.println("element text is "+arg2);
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
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		
	}

	@Override
	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		System.out.println("driver focue switched to window"+arg1.getTitle());
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		System.out.println("alert came with message as "+arg0.switchTo().alert().getText());
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		System.out.println("alert came with message as "+arg0.switchTo().alert().getText());
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("changing elmenet value");
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("clicking on element");
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("locating an element using "+arg0);
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		
	}

	@Override
	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		System.out.println("retrieving element text");
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
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		
	}

	@Override
	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		System.out.println("switch driver focus from window "+arg1.getTitle());
	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		System.out.println("got an execption i.e. "+arg0.getClass().getName());
		System.out.println("exception message is "+arg0.getMessage());
	}
	
}
