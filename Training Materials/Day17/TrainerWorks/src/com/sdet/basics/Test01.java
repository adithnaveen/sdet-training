package com.sdet.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test01 {
	public static void main(String[] args) {
		
		WebDriver driver; 
		
		
		/*// TODO 1 Set the path - I've to tell this application where is chrome driver 
		System.setProperty("webdriver.chrome.driver", 
			"C:\\OnlineTraining\\SDET May 2018\\drivers\\chromedriver.exe"); 
		
		// TODO 2 Load The driver
		driver = new ChromeDriver(); */
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\OnlineTraining\\SDET May 2018\\drivers\\geckodriver.exe"); 
		
		driver = new FirefoxDriver(); 
		
		// TODO 3 Open the browser 
		String url = "http://msn.com"; 
		driver.get(url);
		
		// TODO 4 Perform Operation on the browser 
		String webSiteTitle = driver.getTitle(); 
		System.out.println("Title of the web application: " + webSiteTitle);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO 5 Close the browser 
		driver.quit(); 
	}
}
