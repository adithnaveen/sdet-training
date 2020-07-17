package com.sdet.basic.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sdet.utilities.Driver;

public class GoogleSearchTest02 {


	WebDriver driver; 
	String url ; 
	
	@Before
	public void setUp(){
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH); 
			
		driver = new ChromeDriver(); 
		url = "https://www.google.com/"; 
		
	}
	
	@After
	public void tearDown(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit(); 
	}
	
	
	@Test
	public void googleTest(){
		
		// invoke the browser to open url 
		driver.get(url);
		
//		id="lst-ib"
//		id="gs_taif0"
//		id="gs_htif0"


		String element1="lst-ib"; 
		String element2="gs_taif0"; 
		String element3="gs_htif0";
		
		
		String searchQuery="places to visit near me ";
		
		WebElement searchElement = null; 
		
//		searchElement = driver.findElement(By.id(element1)).isEnabled();
		
		// for Desktop 
		if(driver.findElement(By.id(element1)).isEnabled()){
			System.out.println("Element enabled is " + element1);
			searchElement = driver.findElement(By.id(element1));
			searchElement.sendKeys(searchQuery);
			
		}else 
			// may be for mobile 
			if(driver.findElement(By.id(element2)).isEnabled()){
			
				System.out.println("Element enabled is " + element2);
				searchElement = driver.findElement(By.id(element2));
				searchElement.sendKeys(searchQuery);
		}else 
			// may be for tablet or fablet 
			if(driver.findElement(By.id(element3)).isEnabled()){
			
				
				System.out.println("Element enabled is " + element3);
				searchElement = driver.findElement(By.id(element3));
				searchElement.sendKeys(searchQuery);
			}


		
	}
	
	
	

}
