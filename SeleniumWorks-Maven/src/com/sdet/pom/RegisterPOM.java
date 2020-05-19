package com.sdet.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPOM {

	// the driver info is given by test script 
	private WebDriver driver; 
	
	private WebElement element; 
	
	// constructor to load the driver 
	public RegisterPOM(WebDriver driver){
		this.driver = driver; 
	}
	
	// inputEmail
	public void sendEmail(String email){
		element = driver.findElement(By.id("inputEmail")); 
		element.clear(); 
		element.sendKeys(email);
	}
	
	public void sendPassword(String password){
		element = driver.findElement(By.id("inputPassword")); 
		element.clear(); 
		element.sendKeys(password);
	}
	
	public void sendConfirmPassword(String confirmPassword){
		element = driver.findElement(By.id("confirmPassword")); 
		element.clear(); 
		element.sendKeys(confirmPassword);
	}
	
	public void sendFirstName(String firstName){
		element  = driver.findElement(By.id("firstName"));
		element.clear();
		element.sendKeys(firstName);
	}
	
	public void sendLastName(String lastName){
		element = driver.findElement(By.id("lastName")); 
		element.clear();
		element.sendKeys(lastName);
	}
	
	
	public void sendPhoneNumber(String phoneNumber){}
	public void clickDateOfBirth(int dateOfBirth){}
	public void clickMonthOfBirth(String monthOfBirth){}
	public void clickYearOfBirth(int yearOfBirth){}
	
	// TODO 
	
	
	
	
}
