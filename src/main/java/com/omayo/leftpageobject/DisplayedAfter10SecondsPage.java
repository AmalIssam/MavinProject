package com.omayo.leftpageobject;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;

public class DisplayedAfter10SecondsPage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(id = "delayedText")
	private WebElement delayedText;

	@FindBy(xpath = "//button[@onclick='setTimeout(myFunctionAXD,10000)']")
	private WebElement checkButton;

	@FindBy(xpath = "//input[@id='dte']")
	private WebElement myOption;

	public DisplayedAfter10SecondsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void displayedAfter10Seconds() throws Throwable {
		  action.JSClick(driver, checkButton);
		  Thread.sleep(11000);
		  action.JSClick(driver,myOption);
		  action.getText(delayedText);
		  Thread.sleep(5000);
	}
}