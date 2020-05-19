@Sanity 
Feature:  login to web application 

# before for only feature file 
Background: 
		Given the browser is open 

Scenario: 
	When user given valid user name and password 
		| username   	| 		password			|
		| krishna			| 		secet 				| 
		|	ravi 				|   	hello123 			| 
		|	adithya			| 		testing111		|  
	Then take user to home page 
	

Scenario: 
	When user given invalid valid user name and password 
		| username   	| 		password			|
		| ffff			| 		secet 				| 
		|	ddd 				|   	hello123 			| 
		|	gggg			| 		testing111		|  
	Then take user to home page 
	
	