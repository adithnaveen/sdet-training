package com.sdet.basic.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sdet.utilities.Driver;

// this program shall have multiple test cases 
// 1. to get the attribute value of the button 


public class MultipleTestCases04 {

	WebDriver driver; 
	String baseUrl1;
	
	@Before
	public void setUp(){
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH); 
			
		driver = new ChromeDriver(); 
		baseUrl1 = "http://naveenks.com/web/RegForm.html"; 
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
	public void getAttributeValueTest() throws InterruptedException{
		driver.get(baseUrl1);
		
		// scroll down for a page (values to be given in pixel) 
		// get the driver element mapped to javascriptexecutor 
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver; 
		jsExecutor.executeScript("window.scrollTo(0,580)"); 
		System.out.println("After scroll ");
		
		Thread.sleep(1000);
		String xpath="/html/body/div[1]/form/div[15]/div/input[1]"; 
		WebElement regBtnElement = driver.findElement(By.xpath(xpath)); 
		
		
		String elementAttributeValue = regBtnElement.getAttribute("value"); 
		System.out.println("Attribute Value is " + elementAttributeValue);
	}
	
	
}
