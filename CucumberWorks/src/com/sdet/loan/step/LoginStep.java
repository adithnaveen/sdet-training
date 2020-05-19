package com.sdet.loan.step;

import java.util.List;
import java.util.Map;

import com.sdet.beans.LoginBean;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// ctrl + shift + o -> to auto import 
public class LoginStep {

	@Given("^the browser is open$")
	public void the_browser_is_open() throws Throwable {
		System.out.println("the browser is open....");
	}

	/*@When("^user given valid user name and password$")
	public void user_given_valid_user_name_and_password(DataTable dataTable) throws Throwable {
		System.out.println("user given valid user name and password....");
		
		List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class); 

		System.out.println("User Name " + dataList.get(0).get("username"));
		System.out.println("Password " +  dataList.get(0).get("password"));

		System.out.println("User Name " + dataList.get(1).get("username"));
		System.out.println("Password " +  dataList.get(1).get("password"));

		System.out.println("User Name " + dataList.get(2).get("username"));
		System.out.println("Password " +  dataList.get(2).get("password"));
		
		for(Map<String, String> temp : dataList){
			System.out.println("User Name " + temp.get("username") 
				+", password : " + temp.get("password"));
		}
		
		
		
	}*/

	@Then("^take user to home page$")
	public void take_user_to_home_page() throws Throwable {
		System.out.println("take user to home page.....");
	}

	@When("^user given invalid valid user name and password$")
	public void user_given_invalid_valid_user_name_and_password(DataTable dataTable) throws Throwable {
	
		System.out.println("For Testing invalid credentials... ");
		List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class); 


		for(Map<String, String> temp : dataList){
			System.out.println("User Name " + temp.get("username") 
				+", password : " + temp.get("password"));
		}
		
	}
	
	
	
	
	@When("^user given valid user name and password$")
	public void user_given_valid_user_name_and_password(List<LoginBean> loginList) throws Throwable {
		
		for(LoginBean temp : loginList){
			System.out.println(temp.getUsername() +" ----  " + temp.getPassword());
		}
	}
	
	
}
