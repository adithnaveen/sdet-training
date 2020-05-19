package com.sdet.pom.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.sdet.generics.GenericMethods;
import com.sdet.pom.RegisterPOM;
import com.sdet.pom.RegisterPOM1;
import com.sdet.utilities.DriverFactory;
import com.sdet.utilities.ScreenShot;

public class RegistrationPOMTest {

	// automation variables 
	WebDriver driver; 
	String baseUrl ; 
	GenericMethods genericMethods; 
	ScreenShot screenShot; 

	RegisterPOM1 registerPOM; 
	
	
	@Before
	public void setUp(){
		driver = DriverFactory.getDriver("chrome"); 
		baseUrl = "http://naveenks.com/web/RegForm.html"; 
		
		genericMethods = new GenericMethods(driver); 
		screenShot = new ScreenShot(driver);
		registerPOM = new RegisterPOM1(driver); 
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
	public void registerFormTest(){
		driver.get(baseUrl);
		
		registerPOM.sendEmail("harry@gmail.com");
		registerPOM.sendPassword("secret@123");
		registerPOM.sendConfirmPassword("secret@123");
		registerPOM.sendFirstName("harry");
		registerPOM.sendLastName("Short");
		registerPOM.sendPhoneNumber("234343434");
		
		registerPOM.clickRegBtn();
	}
	
	@Test
	public void registerFormTest1(){
		driver.get(baseUrl);
		
		registerPOM.sendEmail("Peter@gmail.com");
		registerPOM.sendPassword("secPetertre@123");
		registerPOM.sendConfirmPassword("sPetertecre@123");
		registerPOM.sendFirstName("Peter");
		registerPOM.sendLastName("Larry");
		registerPOM.sendPhoneNumber("2434");
		
		registerPOM.clickRegBtn();
	}
}














