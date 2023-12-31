package com.omayo.rightpagetest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.omayo.base.Base;
import com.omayo.rightpageobject.DefaultSelectedCheckBoxPage;

public class DefaultSelectedCheckBoxTest extends Base {
	private DefaultSelectedCheckBoxPage defaultSelectedCheckBoxPage;
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
	public void defaultSelectedCheckBoxTest() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		defaultSelectedCheckBoxPage = new DefaultSelectedCheckBoxPage(driver);
		defaultSelectedCheckBoxPage.defaultSelectedCheckBox();
		
	}
}