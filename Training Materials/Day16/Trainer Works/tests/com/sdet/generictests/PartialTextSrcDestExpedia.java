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

public class PartialTextSrcDestExpedia {


	WebDriver driver; 
	String baseUrl ; 
	GenericMethods genericMethods; 
	
	
	@Before
	public void setUp(){
		driver = DriverFactory.getDriver("chrome"); 
		baseUrl = "https://www.expedia.com/"; 
		
		genericMethods = new GenericMethods(driver); 
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
	public void partialTextTest() throws InterruptedException{
		driver.get(baseUrl);
		
		genericMethods.getElement("tab-flight-tab-hp", "id").click(); 
		
		String flyFromPartial = "san"; 
		String flyToPartial="was"; 
		
		List<String> listOfSourceLocations = new ArrayList<String>();
		List<String> listOfDestiationLocation =new ArrayList<String>();
		
		genericMethods.getElement("flight-origin-hp-flight", "id").clear(); 
		genericMethods.getElement("flight-origin-hp-flight", "id").sendKeys(flyFromPartial);
		
		Thread.sleep(1500);
		
		List<WebElement> flyFromAirPorts = genericMethods.getElements("class", "results-item"); 
		
		for(WebElement temp : flyFromAirPorts){
			System.out.println(temp.getText());
			listOfSourceLocations.add(temp.getText());
		}
		
		/////////////////////////////////////////////

		System.out.println("Destination locations : ");
		genericMethods.getElement("flight-destination-hp-flight", "id").clear(); 
		genericMethods.getElement("flight-destination-hp-flight", "id").sendKeys(flyToPartial);
		
		Thread.sleep(1500);
		
		List<WebElement> flyToAirPorts = genericMethods.getElements("class", "results-item"); 
		
		for(WebElement temp : flyToAirPorts){
			System.out.println(temp.getText());
			listOfDestiationLocation.add(temp.getText());
		}
		
		// send each value from source to destination 
		
		for(String temp : listOfSourceLocations){
			System.out.println("Test Case Source  : " + temp +" execution ... ");
			
			genericMethods.getElement("flight-origin-hp-flight", "id").clear(); 
			genericMethods.getElement("flight-origin-hp-flight", "id").sendKeys(temp);
			
			Thread.sleep(700);
			
			for(String temp1 : listOfDestiationLocation){
				
				System.out.println("Test Case Destination  " + temp1 +", exeuction... ");
				genericMethods.getElement("flight-destination-hp-flight", "id").clear(); 
				genericMethods.getElement("flight-destination-hp-flight", "id").sendKeys(temp1);
				
			}
			Thread.sleep(600);
		}
		
	}
	
	
	
}











