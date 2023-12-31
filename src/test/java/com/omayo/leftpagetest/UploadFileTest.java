package com.omayo.leftpagetest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.omayo.base.Base;
import com.omayo.leftpageobject.UploadFilePage;


public class UploadFileTest extends Base{
	private UploadFilePage uploadFilePage ;
	public WebDriver driver;
	@BeforeClass
	public void openPage() throws IOException {
		driver = intializEDriver();
		driver.get(prop.getProperty("url"));
	}

	@AfterClass
	public void clouser() {
		//driver.quit();
	}

	@Test()
	public void uploadFileTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		uploadFilePage  = new UploadFilePage(driver);
		uploadFilePage.uploadFile();
	}
}