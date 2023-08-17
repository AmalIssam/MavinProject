package com.omayo.leftpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;

public class MultiSelectionBoxPage {
	public WebDriver driver;
	Action action = new Action();

	@FindBy(id = "multiselect1")
	private WebElement selectionBox;

	
	
	
	
	public MultiSelectionBoxPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void multiSelectionBox() throws InterruptedException {
		Thread.sleep(3000);
		
		action.selectByValue(selectionBox, "swiftx");
		Thread.sleep(2000);
		action.selectByValue(selectionBox, "audix");
		

	}
}