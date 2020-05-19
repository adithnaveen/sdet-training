package com.sdet.parameterization;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;

import com.sdet.beans.LoginBean;
import com.sdet.generics.GenericMethods;
import com.sdet.readexcel.ApachePOIExcelRead;
import com.sdet.utilities.DriverFactory;
import com.sdet.utilities.ScreenShot;


@RunWith(Parameterized.class)
public class LoginFormExcelTest {


	// automation variables 
	WebDriver driver; 
	String baseUrl ; 
	GenericMethods genericMethods; 
	ScreenShot screenShot; 
	static ApachePOIExcelRead excelRead; 
	static String filePath; 
	
	// parameterized variables 
	private LoginBean loginBean;  
	
	// the injection of the values for this constructor is done 
	// by junit provided we have a method @Parameters 
	public LoginFormExcelTest(LoginBean loginBean){
		this.loginBean = loginBean; 
	}
	
	@Before
	public void setUp(){
		driver = DriverFactory.getDriver("chrome"); 
		baseUrl = "http://naveenks.com/web/LoginForm.html"; 
		
		genericMethods = new GenericMethods(driver); 
		screenShot = new ScreenShot(driver); 
	}
	
	@BeforeClass
	public static void setUpBeforeClass(){
		excelRead = new ApachePOIExcelRead(); 
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
	
	// List<List<Object>
	@Parameters
	public static List<LoginBean> data(){
		
		List<LoginBean> loginList = new ArrayList<LoginBean>(); 
		// return List of Array of Object 
		
		// the values here can be hard coded 
		// or pull from database or excel sheet 
		filePath = "C:/Users/Naveen/Desktop/Testing.xlsx"; 
		
		List<List<Object>> list = excelRead.getExcelContent(filePath);
		
		for(List<Object> temp : list){
			LoginBean loginBean = new LoginBean(); 
			loginBean.setUserName(temp.get(0).toString());
			loginBean.setPassword(temp.get(1).toString());
			loginList.add(loginBean); 
		}

		return loginList; 
	}
	
	@Test
	public void loginParameterTest(){
		driver.get(baseUrl);
		
		genericMethods.getElement("uname", "id").clear();
		genericMethods.getElement("uname", "id").sendKeys(this.loginBean.getUserName());
		
		genericMethods.getElement("pwd", "id").clear();
		genericMethods.getElement("pwd", "id").sendKeys(this.loginBean.getPassword());
		
		genericMethods.getElement("submitBtn", "id").click(); 
	}

	
	
}
