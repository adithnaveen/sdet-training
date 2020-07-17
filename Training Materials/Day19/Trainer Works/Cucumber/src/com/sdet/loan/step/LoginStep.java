package com.sdet.loan.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// ctrl + shift + o -> to auto import 
public class LoginStep {

	@Given("^the browser is open$")
	public void the_browser_is_open() throws Throwable {
		System.out.println("the browser is open....");
	}

	@When("^user given valid user name and password$")
	public void user_given_valid_user_name_and_password() throws Throwable {
		System.out.println("user given valid user name and password....");
	}

	@Then("^take user to home page$")
	public void take_user_to_home_page() throws Throwable {
		System.out.println("take user to home page.....");
	}

}
