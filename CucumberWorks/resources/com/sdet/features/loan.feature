@Smoke
Feature: To sanction the loan for capable customers 

# this is my comment 

Scenario Outline: Loan sanction for Mortgage 
	Given the loan applied for "<amount>"
	And the credit score is "<creditscore>"
	When customer works in "<firmtype>" firm 
	And check salary more than "<salary>" 
	And the age should not be more than "<age>" years 
	Then issue the loan 
	But customer should clear hypothicate with valid letter 
	

Examples: 
# example will help to do value substituion 
|		amount 		|		creditscore			| 	firmtype		|		salary		|		age		|
|		20000			|		666							| 	govt				|		4000			|		45		| 
|		70000			|		678							|		private			|		5600			|		37		| 
|		100000		|		777							|		private			|		8000			|		49		|

