package com.sdet.generics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods {

	WebDriver driver ; 
	
	// the driver object will be given from selenium 
	// script 
	public GenericMethods(WebDriver driver){
		this.driver = driver; 
	}
	
	// method which will return the webelemen on the request from 
	// selenium script 
	
	
	public WebElement getElement(String locator, String type ){
		WebElement element = null; 
		type = type.toLowerCase(); 
		
		try{
			if(type.equals("id")){
				element = driver.findElement(By.id(locator)); 
			}else if(type.equals("name")){
				element = driver.findElement(By.name(locator)); 
			}else if(type.equals("xpath")){
				element = driver.findElement(By.xpath(locator));
			}else if(type.equals("partiallinktext")){
				element = driver.findElement(By.partialLinkText(locator)); 
			}else if(type.equals("class")){
				element = driver.findElement(By.className(locator));
			}
			
			if(checkSingleEntry(type, locator)){
				return element; 
			}else{
				System.out.println("Sorry Element Not found or has more than one entry");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public List<WebElement> getElements(String type, String locator){
		List<WebElement> elements = null;
		type = type.toLowerCase(); 
		
		if(type.equals("id")){
			elements = driver.findElements(By.id(locator)); 
		}else if(type.equals("name")){
			elements = driver.findElements(By.name(locator));
		}else if(type.equals("xpath")){
			System.out.println("Locator looking is " + locator);
			elements = driver.findElements(By.xpath(locator));
		}else if(type.equals("class")){
			elements = driver.findElements(By.className(locator));
		}
		// we may have to fill other type's 
		
		return elements; 
	}
	
	public boolean checkSingleEntry(String type, String locator){
		return getElements(type, locator).size()==1; 
	}
	
}
















