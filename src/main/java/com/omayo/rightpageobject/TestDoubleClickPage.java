package com.omayo.rightpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omayo.actiondriver.Action;



public class TestDoubleClickPage {
	public WebDriver driver;
    Action action = new Action();
	 
	
	@FindBy(id = "testdoubleclick")
	private WebElement doubleClick;
	
	@FindBy(xpath = "//div[@id='myDropdown']/a[1]")
	private WebElement faceB;

	public TestDoubleClickPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void testDoubleClick() throws InterruptedException {
		Thread.sleep(3000);
	    action.doubleClick(driver, doubleClick);
	     Thread.sleep(3000);
	     action.click(driver, faceB);
		Thread.sleep(4000);

	}
}