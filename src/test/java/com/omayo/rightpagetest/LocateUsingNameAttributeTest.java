package com.omayo.rightpagetest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.omayo.base.Base;
import com.omayo.dataprovider.ExcelDataProvider;
import com.omayo.rightpageobject.LocateUsingNameAttributePage;
import com.omayo.utility.ExcelUtils;

public class LocateUsingNameAttributeTest extends Base {
    private LocateUsingNameAttributePage locateUsingNameAttributePage;
    ExcelUtils excelUtils = new ExcelUtils();

    @BeforeClass
    public void openPage() throws IOException {
        excelUtils.addRandomDataToEmptyRows(5,0);
        driver = intializEDriver();
        driver.get(prop.getProperty("url"));
    }

    @AfterClass
    public void closure() {
        driver.quit();
    }

    @Test(dataProvider = "LocateUsingNameAttributePage", dataProviderClass = ExcelDataProvider.class, priority = 1)
    public void nameAttributeTest(Object[] testData) throws InterruptedException {
    	
    	String textQA = (String) testData[0];
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        locateUsingNameAttributePage = new LocateUsingNameAttributePage(driver);
        locateUsingNameAttributePage.locateUsingNameAttribute(textQA);
    }

}