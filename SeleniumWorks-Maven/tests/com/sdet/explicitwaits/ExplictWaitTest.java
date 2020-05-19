package com.sdet.explicitwaits;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sdet.generics.GenericMethods;
import com.sdet.utilities.DriverFactory;

public class ExplictWaitTest {

	WebDriver driver; 
	String baseUrl ; 
	GenericMethods genericMethods; 
	
	
	@Before
	public void setUp(){
		driver = DriverFactory.getDriver("chrome"); 
		baseUrl = "http://naveenks.com/web/LoginForm.html"; 
		
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
	public void loginExplicitWaitTest(){
		
		driver.get(baseUrl);
		// genericMethods.getElement("uname", "id").sendKeys("something");
		
		WebDriverWait wait = new WebDriverWait(driver, 10); 

		WebElement userName = wait.until
			(ExpectedConditions.visibilityOfElementLocated(By.id("uname")));
		
		userName.sendKeys("user@example.com");
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
