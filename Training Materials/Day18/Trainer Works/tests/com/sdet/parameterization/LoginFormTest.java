package com.sdet.parameterization;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;

import com.sdet.generics.GenericMethods;
import com.sdet.utilities.DriverFactory;
import com.sdet.utilities.ScreenShot;


@RunWith(Parameterized.class)
public class LoginFormTest {


	// automation variables 
	WebDriver driver; 
	String baseUrl ; 
	GenericMethods genericMethods; 
	ScreenShot screenShot; 
	
	// parameterized variables 
	private String userName; 
	private String password; 
	
	// the injection of the values for this constructor is done 
	// by junit provided we have a method @Parameters 
	public LoginFormTest(String userName, String password){
		this.userName = userName; 
		this.password = password; 
	}
	
	@Before
	public void setUp(){
		driver = DriverFactory.getDriver("chrome"); 
		baseUrl = "http://naveenks.com/web/LoginForm.html"; 
		
		genericMethods = new GenericMethods(driver); 
		screenShot = new ScreenShot(driver); 
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

	// jUnit will invoke the static method which is annotated with Parameters 
	// and the array of value which are generated from this method 
	// will be injected to contractors 
	@Parameters
	public static List<Object[]> data(){
		// return List of Array of Object 
		
		// the values here can be hard coded 
		// or pull from database or excel sheet 
		return Arrays.asList(new String[][]{
			{"Ashwini", "secret@111"}, 
			{"Krishna", "secret@2323"}, 
			{"Laxmi", "secret@11"}, 
			{"Michael", "333434@hello"}, 
			{"Ravi", "secret@13441"}, 
			{"Siby", "secret@5551"}, 
			{"Tripti", "secret@11555"}, 
			
		});
	}
	
	
	@Test
	public void loginParameterTest(){
		driver.get(baseUrl);
		
		genericMethods.getElement("uname", "id").clear();
		genericMethods.getElement("uname", "id").sendKeys(this.userName);
		
		genericMethods.getElement("pwd", "id").clear();
		genericMethods.getElement("pwd", "id").sendKeys(this.password);
		
		screenShot.captureScreenShot(this.userName);
		genericMethods.getElement("submitBtn", "id").click(); 
	}

	
	
}
