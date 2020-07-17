package com.sdet.action;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sdet.utilities.Driver;


// program to show working of action classes 
public class ActionTest {
	WebDriver driver; 
	String baseUrl1;
	
	@Before
	public void setUp(){
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH); 
			
		driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		baseUrl1 = "https://tasyah.com/"; 
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
	public void actionTest() throws InterruptedException{
		driver.get(baseUrl1);
		
		String menuItem=".//*[@id='menu_category_Menu_VIfWm2LT_439']/a/span/span";
		String subMenuItem=".//*[@id='menu_category_Menu_VIfWm2LT_439']/ul/li[2]/a/span"; 
		
		// logical reference of menu item 
		WebElement menuItemElement = driver.findElement(By.xpath(menuItem)); 
		
		Actions actions = new Actions(driver); 
		actions.moveToElement(menuItemElement).perform(); 
		
		Thread.sleep(1000);
		
		System.out.println("clicking on sub menu item ");
		
		WebElement subMenuElement = driver.findElement(By.xpath(subMenuItem));
		// this works good 
//		subMenuElement.click(); 
		
		
		// using action classes 
		actions.click(subMenuElement).perform(); 
		
	}
	
	
	
	
}









