package com.omayo.leftpagetest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.omayo.base.Base;
import com.omayo.leftpageobject.TryItButtonPage;



public class TryItButtonTest extends Base{
    public WebDriver driver ;
	private TryItButtonPage tryItButtonPage;

	@BeforeClass
	public void openPage() throws IOException {
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterClass
	public void clouser() {
		driver.quit();
	}

	@Test()
	public void tryItButtonTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tryItButtonPage = new TryItButtonPage(driver);
		tryItButtonPage.TryItButton();
	}
}