package com.sdet.pom.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.sdet.generics.GenericMethods;
import com.sdet.pom.RegisterPOM;
import com.sdet.utilities.DriverFactory;
import com.sdet.utilities.ScreenShot;

public class RegistrationPOMTest2 {

	// automation variables 
	WebDriver driver; 
	String baseUrl ; 
	GenericMethods genericMethods; 
	ScreenShot screenShot; 
	RegisterPOM rPom; 
	@Before
	public void setUp(){
		driver = DriverFactory.getDriver("chrome"); 
		baseUrl = "http://naveenks.com/web/RegForm.html"; 
		
		genericMethods = new GenericMethods(driver); 
		screenShot = new ScreenShot(driver);
		rPom = new RegisterPOM(driver); 
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
		
		rPom.sendEmail("harry@yahoo.com");
		rPom.sendPassword("secret@123");
		rPom.sendConfirmPassword("secret@123");
		rPom.sendFirstName("Harry");
		rPom.sendLastName("Short");
		rPom.sendPhoneNumber("3487384734"); 
	}
}














