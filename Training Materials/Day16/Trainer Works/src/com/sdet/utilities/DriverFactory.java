package com.sdet.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// this class will given you the driver based on the 
// string parameter passed 

public class DriverFactory {

	
	public static WebDriver getDriver(String driverName){

		WebDriver driver = null; 

		// we can even set some parameters 
		
		if(driverName.equals("chrome")){
			System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH); 
			driver = new ChromeDriver(); 
			
		}else if(driverName.equals("firefox")){
			System.setProperty(Driver.FIREFOX_KEY, Driver.FIREFOX_PATH); 
			driver = new FirefoxDriver(); 
			
		}else if(driverName.equals("ie")){
			// TODO 
		}
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver; 
	}
}








