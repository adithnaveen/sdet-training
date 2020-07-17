package com.sdet.basic.tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import com.sdet.utilities.Driver;

public class DemoCart07 {
	WebDriver driver; 
	String baseUrl1;
	
	@Before
	public void setUp(){
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH); 
			
		driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		baseUrl1 = "https://demostore.x-cart.com/"; 
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
	public void demoCartTest() throws InterruptedException{
		driver.get(baseUrl1);

		driver.findElement(By.linkText("Shipping")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Contact")).click(); 
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("name")).sendKeys("Ravi");
		driver.findElement(By.id("email")).sendKeys("ravi@example.com");
		driver.findElement(By.id("subject")).sendKeys("Testin application");
		driver.findElement(By.id("message")).sendKeys("Testing "
				+ "the application with link text and partial link Text");
		

		driver.findElement(By.xpath("//*[@id='form-1528772470451']/div[2]/div[2]/div/button"))
			.click();
	
	}
	
	
	
	

}
