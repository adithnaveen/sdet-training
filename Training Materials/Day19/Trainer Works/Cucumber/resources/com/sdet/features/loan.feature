@Smoke
Feature: To sanction the loan for capable customers 

# this is my comment 

Scenario: Loan sanction for Mortgage 
	Given the loan applied for 20000
	And the credit score is 678
	When customer works in govt firm 
	And check salary more than 2000 
	And the age should not be more than 50 years 
	Then issue the loan 
	But customer should clear hypothicate with valid letter 
	
	

Scenario: Loan sanction for Mortgage 
	Given the loan applied for 70000
	And the credit score is 555
	When customer works in private firm 
	And check salary more than 3000 
	And the age should not be more than 50 years 
	Then issue the loan 
	But customer should clear hypothicate with valid letter 
	
	
	