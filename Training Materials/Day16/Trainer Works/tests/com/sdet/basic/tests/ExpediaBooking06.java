package com.sdet.basic.tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sdet.utilities.Driver;

public class ExpediaBooking06 {

	WebDriver driver; 
	String baseUrl1;
	
	@Before
	public void setUp(){
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH); 
			
		driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		baseUrl1 = "https://www.expedia.com/"; 
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
	public void bookingFlightsPage() throws InterruptedException{
		driver.get(baseUrl1);
		
		// list out the locators  on the webpage 
		String flightTab = "tab-flight-tab-hp"; 
		String originFly = "flight-origin-hp-flight";
		String destinationFly = "flight-destination-hp-flight"; 

		
		String departDate ="flight-departing-hp-flight"; 
		String depathDateValue = ".//*[@id='flight-departing-wrapper-hp-flight']/div"
				+ "/div/div[2]/table/tbody/tr[3]/td[4]/button"; 
		
		
		String returnDate = "flight-returning-hp-flight"; 
		String returnDateValue=".//*[@id='flight-returning-wrapper-hp-flight']/div/"
				+ "div/div[2]/table/tbody/tr[4]/td[5]/button"; 
		
		String travllers = "//*[@id='gcw-flights-form-hp-flight']/fieldset[2]/div/div[4]/div/div/ul/li/button"; 
		
		String incrementAdults ="//*[@id='gcw-flights-form-hp-flight']/fieldset[2]"
				+ "/div/div[4]/div/div/ul/li/div/div/div/div[1]/div[4]/button/span[1]"; 
		
		String decrementAdults ="//*[@id='gcw-flights-form-hp-flight']/fieldset[2]"
				+ "/div/div[4]/div/div/ul/li/div/div/div/div[1]/div[2]/button/span[1]";
		
		
		
		// source and destination travel location 
		String sourceLocation = "Bengaluru, India (BLR-Kempegowda Intl.)"; 
		String destinationLocation = "Washington, DC (IAD-Washington Dulles Intl.)"; 
		try{
		// operations 
		// 1. click on flights tab 
		driver.findElement(By.id(flightTab)).click();
		
		// 2. enter source and  destination 
		driver.findElement(By.id(originFly)).sendKeys(sourceLocation);
		driver.findElement(By.id(destinationFly)).sendKeys(destinationLocation);

		Thread.sleep(1500);
		
		// departing date (click on date allow the popup to come then select date )
		driver.findElement(By.id(departDate)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(depathDateValue)).click();
		
		// return date (click on date allow the popup to come then select date )
		driver.findElement(By.id(returnDate)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(returnDateValue)).click();
		
		// select number of adults 
		driver.findElement(By.xpath(travllers)).click(); 
		Thread.sleep(1500);

		driver.findElement(By.xpath(incrementAdults)).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath(incrementAdults)).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath(incrementAdults)).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath(decrementAdults)).click();
		
		
		Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace(); 
		}
		
	}
	
	
	
	
	
	
	
	
	
}
