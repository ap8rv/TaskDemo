package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static ChromeDriver driver;
	public static Properties prop;
	
	public void BaseTest() throws IOException{
		
		try {
		FileInputStream fis = new FileInputStream("/simplesurancetask/src/main/java/com/qa/config/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
	    }
		catch(FileNotFoundException e) {
			e.printStackTrace();	
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
	
}
