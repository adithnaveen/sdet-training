package com.sdet.basic.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sdet.utilities.Driver;

public class LoginTest01 {

	WebDriver driver; 
	String url ; 
	
	@Before
	public void setUp(){
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH); 
			
			driver = new ChromeDriver(); 
			
		url = "http://naveenks.com/web/LoginForm.html"; 
		
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
	public void loginTest(){
		driver.get(url);
		
		driver.findElement(By.id("uname")).clear(); 
		driver.findElement(By.id("uname")).sendKeys("sample@example.com");
		
		
		driver.findElement(By.id("pwd")).clear(); 
		driver.findElement(By.id("pwd")).sendKeys("secret!234"); 
		
		driver.findElement(By.id("submitBtn")).click(); 
		
	}
	
	
	
}
