package com.sdet.generictests;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.sdet.generics.GenericMethods;
import com.sdet.utilities.DriverFactory;


// program to show working of GenericMethods 
// using driverfactory and having multiple test cases 
// 1. Registration form, 2. Msn Login 
public class GenericTest01 {

	WebDriver driver; 
	String baseUrl ; 
	String baseUrl1; 
	GenericMethods genericMethods; 
	
	
	@Before
	public void setUp(){
		driver = DriverFactory.getDriver("chrome"); 
		baseUrl = "http://naveenks.com/web/RegForm.html"; 
		baseUrl1 = "https://www.msn.com/en-in/"; 
		genericMethods = new GenericMethods(driver); 
	}
	
	@After
	public void tearDown(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit(); 
	}
	
	
	@Test
	public void regForm(){
		driver.get(baseUrl);
		
		String emailLocator = "inputEmail"; 
		String passwordLocator = "inputPassword"; 
		String confirmPasswordLocator = "confirmPassword"; 
		String firstNameLocator = "firstName"; 
		String lastNameLocator ="lastName";
		
		genericMethods.getElement(emailLocator, "id").sendKeys("siby@gmail.com");
		genericMethods.getElement(passwordLocator, "id").sendKeys("secret@123");
		genericMethods.getElement(confirmPasswordLocator, "id").sendKeys("secret@123");
		genericMethods.getElement(firstNameLocator, "id").sendKeys("Siby");
		genericMethods.getElement(lastNameLocator, "id").sendKeys("A");
	}
	


	@Test
	public void msnLogin(){
		driver.get(baseUrl1);
		
		String outlookLocator = ".//*[@id='main']/div[1]/div[1]/div/ul/li[1]/a/h3"; 
		String signInLocator=".//*[@id='main']/div[1]/div[2]/div[1]/div/section/div/ul/li[1]/a";
		String userNameLocator="i0116"; 
		String btnNextLocator = "idSIButton9"; 
		
		// hover on outlook email 
		
		Actions action = new Actions(driver); 
		action.moveToElement(genericMethods.getElement(outlookLocator, "xpath")).perform(); 
		
		genericMethods.getElement(signInLocator, "xpath").click(); 
		genericMethods.getElement(userNameLocator, "id").sendKeys("naveen@probits.in");
		genericMethods.getElement(btnNextLocator, "id").click();
		
	}
}
















