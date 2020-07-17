package com.sdet.loan.step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoanSteps {
	
	// loanAmount value will be passed by cucumber 
	@Given("^the loan applied for \"([^\"]*)\"$")
	public void the_loan_applied_for_amount(int loanAmount ){
		System.out.println("the loan applice for  "+loanAmount+".....");
	}
	
	@And("^the credit score is \"([^\"]*)\"$")
	public void the_credit_score(int creditScroe){
		System.out.println("the credit score is "+creditScroe+" ....");
	}
	
	@When("^customer works in \"([^\"]*)\" firm$")
	public void customer_works_in_firm(String firmType){
		System.out.println("customer works in  "+ firmType +"firm....");
	}
	
	@And("^check salary more than \"([^\"]*)\"$")
	public void check_salary_more_than_Salary(int salary){
		System.out.println("check salary more than "+salary+"...");
	}
	
	@And("^the age should not be more than \"([^\"]*)\" years$")
	public void the_age_should_not_be_more_than_years(int age){
		System.out.println("the age should not be more than "+age+" years....");
	}
	
	@Then("issue the loan")
	public void issue_the_loan(){
		System.out.println("issue the loan...");
	}
	
	@But("customer should clear hypothicate with valid letter")
	public void customer_should_clear_hypothicate_with_valid_letter(){
		System.out.println("customer should clear hypothicate with valid letter....");
	}
	

}









