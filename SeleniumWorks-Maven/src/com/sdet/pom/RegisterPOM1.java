package com.sdet.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM1 {
	
	private WebDriver driver; 
	
	// the driver information will be given by test script 
	
	public RegisterPOM1(WebDriver driver){
		this.driver = driver; 
		
		// we say selenium to instantiate this class 
		// with the driver information passed 
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="inputEmail") 
	private WebElement inputEmail;
	
	@FindBy(id="inputPassword")
	private WebElement inputPassword; 
	
	@FindBy(id="confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(id="firstName")
	private WebElement firstName; 
	 
	@FindBy(id="lastName")
	private WebElement lastName; 
	 
	@FindBy(id="phoneNumber")
	private WebElement phoneNumber; 

	@FindBy(xpath="/html/body/div[1]/form/div[15]/div/input[1]")
	private WebElement regBtn; 
	
	public void sendEmail(String email){
		this.inputEmail.clear(); 
		this.inputEmail.sendKeys(email);
	}
	
	public void sendPassword(String password){
		this.inputPassword.clear(); 
		this.inputPassword.sendKeys(password);
	}
	
	public void sendConfirmPassword(String confPassword){
		this.confirmPassword.clear(); 
		this.confirmPassword.sendKeys(confPassword);
	}

	public void sendFirstName(String firstName){
		this.firstName.clear(); 
		this.firstName.sendKeys(firstName);
	}
	
	public void sendLastName(String lastName){
		this.lastName.clear(); 
		this.lastName.sendKeys(lastName);
	}
	
	public void sendPhoneNumber(String phoneNumber){
		this.phoneNumber.clear(); 
		this.phoneNumber.sendKeys(phoneNumber);
	}
	
	public void clickRegBtn(){
		regBtn.click(); 
	}
	
	
	
	
	
	
	
	
	
	
}
