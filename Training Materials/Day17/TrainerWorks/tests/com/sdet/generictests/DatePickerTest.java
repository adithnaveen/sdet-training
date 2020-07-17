package com.sdet.generictests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sdet.generics.GenericMethods;
import com.sdet.utilities.DriverFactory;
import com.sdet.utilities.ScreenShot;

public class DatePickerTest {


	WebDriver driver; 
	String baseUrl ; 
	GenericMethods genericMethods; 
	ScreenShot screenShot; 
	
	@Before
	public void setUp(){
		driver = DriverFactory.getDriver("chrome"); 
		baseUrl = "https://www.expedia.com/"; 
		
		genericMethods = new GenericMethods(driver); 
		screenShot = new ScreenShot(driver); 
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
	public void datePickerTest() throws InterruptedException{
		
		driver.get(baseUrl);
		
		// move to flights tab 
		genericMethods.getElement("tab-flight-tab-hp", "id").click();
		
		// single click on date to open the date picker 
		genericMethods.getElement("flight-departing-hp-flight", "id").click();
		
		screenShot.captureScreenShot("DatePicker");
		
		Thread.sleep(2500);
		
		// to find all the dates which are not disabled 
		String xpathDates = ".//*[@id='flight-departing-wrapper-hp-flight']/div/div/div[2]/table/tbody/tr/td/button[not(@disabled)]"; 
		
		// store all elements got from the web app in the list 
		List<WebElement> activeDateElements = genericMethods.getElements("xpath", xpathDates); 
		
		System.out.println("Numbber of Active Date " + activeDateElements.size());
		
		// for iteration for each element lets keep in local array 
		List<String> activeDateElementsAsString  = new ArrayList<String>(); 
		
		for(WebElement temp : activeDateElements){
			System.out.println(temp.getText());
			activeDateElementsAsString.add(temp.getText());
		}
		
		// iterate all the elements which are in the list activeDateElementsAsString
		
		for(String temp : activeDateElementsAsString){
			
			String xpathSelectionDate = ".//*[@id='flight-departing-wrapper-hp-flight']"
					+ "/div/div/div[2]/table/tbody/tr/td/button[text()='"+temp+"']"; 
			

			// single click on date to open the date picker 
			genericMethods.getElement("flight-departing-hp-flight", "id").click();

			Thread.sleep(700);
			
			genericMethods.getElement(xpathSelectionDate, "xpath").click();
			
			screenShot.captureScreenShot(); 
			Thread.sleep(700);

			
		}
		
	}
	
	
	
	
	
	
	
	
	
}
