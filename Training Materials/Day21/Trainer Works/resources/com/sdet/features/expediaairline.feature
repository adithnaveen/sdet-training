Feature: show selection of international flights 

Background: 
	Given open web application expedia on chrome browser
	And load airline pom 

Scenario: 
	Given goto flights tab on home page 
	When flying from Bengaluru to washingto DC
	And departing date on 20
	And return date on 27
	And 3 adults travelling 
	And search the flights available 
	Then select the cheapest flight 
	# And close the browser