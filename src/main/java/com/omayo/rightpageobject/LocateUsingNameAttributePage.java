package com.omayo.rightpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.omayo.actiondriver.Action;
import com.omayo.utility.ExcelUtils;

public class LocateUsingNameAttributePage {
    public WebDriver driver;
    Action action = new Action();
   
    @FindBy(name = "textboxn")
    private WebElement LocateUsingName;
  
    public LocateUsingNameAttributePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    
        
    }

    public void locateUsingNameAttribute(String text) throws InterruptedException {
        Thread.sleep(3000);
       action.typestring(LocateUsingName, text);
        Thread.sleep(3000);
    }

    
}