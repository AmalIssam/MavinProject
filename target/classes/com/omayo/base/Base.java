package com.omayo.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	 public static Properties prop ;
	 public static WebDriver driver ;
	   public static WebDriver intializEDriver()throws IOException { 
		   prop = new Properties();
		   String propPath = System.getProperty("user.dir")+ "\\Configration\\data.properties";
		   FileInputStream file = new FileInputStream(propPath);
		   prop.load(file );
	       String BrouserName = prop.getProperty("browser");
	         if (BrouserName.equalsIgnoreCase("chrome")) {
		       WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver(); }
			 else if (BrouserName.equalsIgnoreCase("fireFox")) {
			   WebDriverManager.firefoxdriver().setup();
			   driver = new FirefoxDriver(); }
			 else if (BrouserName.equalsIgnoreCase("Edge")) {
			    WebDriverManager.edgedriver().setup();
			    driver = new EdgeDriver();}
	          else if (BrouserName.equalsIgnoreCase("IE")) {
	             WebDriverManager.iedriver().setup();
		         driver = new InternetExplorerDriver();        
	   }

	       driver.manage().window().maximize();	
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       return driver;	  	 
}
	   public void takeScreenshot(String testName, WebDriver driver) throws IOException {
		   File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String destinationFilePath = System.getProperty("user.dir")+"\\screenshots\\"+testName+".png";
			FileUtils.copyFile(SourceFile,new File(destinationFilePath));
		}
		
	
}
