package com.sdet.basic.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sdet.utilities.Driver;

public class NavigationMultiplePage03 {


	WebDriver driver; 
	String baseUrl1;
	String baseUrl2;
	String baseUrl3;
	
	@Before
	public void setUp(){
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH); 
			
		driver = new ChromeDriver(); 
		baseUrl1 = "https://www.google.com/"; 
		baseUrl2 = "https://in.yahoo.com/?p=us"; 
		baseUrl3 = "https://www.msn.com/en-in/"; 
		
		
	}
	
	@After
	public void tearDown(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
		// to close the tab 
	// 	driver.close(); 
	}
	

	@Test
	public void navigationTest() throws InterruptedException{
		
		// loading google.com 
		driver.get(baseUrl1);
		
		
		
		String baseUrlTitle = driver.getTitle(); 
		System.out.println("Base Url Title " + baseUrlTitle);
		
		// will do some job - simulating 
		Thread.sleep(2000);
		
		// moving from google to yahoo 
		// navigate to baseUrl2 
		driver.navigate().to(baseUrl2);
		
		baseUrlTitle = driver.getTitle(); 
		System.out.println("After Navigation Base Url Title " + baseUrlTitle);
		
		
		System.out.println("Reloading the page - Refresh ");
		driver.navigate().refresh(); 
		baseUrlTitle = driver.getTitle();
		System.out.println("After Refresh Get Title " + baseUrlTitle);
		
		// moving from yahoo to google 
		driver.navigate().back(); 
		baseUrlTitle = driver.getTitle();
		System.out.println("After Navigation back Base Url Title " + baseUrlTitle);

		// you can try with baseUrl3
		
	}
	
	

}
