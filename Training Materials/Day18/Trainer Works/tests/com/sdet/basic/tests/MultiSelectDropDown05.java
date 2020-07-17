package com.sdet.basic.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sdet.utilities.Driver;

public class MultiSelectDropDown05 {
	WebDriver driver; 
	String baseUrl1;
	
	@Before
	public void setUp(){
		System.setProperty(Driver.CHROME_KEY, Driver.CHROME_PATH); 
			
		driver = new ChromeDriver(); 
		baseUrl1 = "https://html.com/attributes/select-multiple/"; 
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
	public void multiSelectTestCase() throws InterruptedException{
		// open the browser 
		driver.get(baseUrl1);
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver; 
		jsExecutor.executeScript("window.scrollTo(0,580)"); 
		System.out.println("After scroll ");
		
		String xpath = ".//*[@id='post-291']/div/div[2]/select"; 
		
		WebElement multiSelectElement = driver.findElement(By.xpath(xpath)); 
		
		Select multiSelect = new Select(multiSelectElement); 
		
		multiSelect.selectByIndex(1);
		Thread.sleep(2500);
		
		multiSelect.selectByIndex(3);
		Thread.sleep(2500);

		multiSelect.selectByIndex(5);
		Thread.sleep(2500);
		
		System.out.println("Deselecting ");
		
		multiSelect.deselectByValue("Lesser");
		Thread.sleep(2000);
		
		multiSelect.selectByVisibleText("Chilean flamingo");
		
		System.out.println("All options select are listed below : ");
		
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		
		for(WebElement element : selectedOptions){
			System.out.println(element.getText());
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
