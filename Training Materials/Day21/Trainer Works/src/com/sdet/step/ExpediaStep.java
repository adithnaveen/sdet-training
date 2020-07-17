package com.sdet.step;

import org.openqa.selenium.WebDriver;

import com.sdet.driverfactory.DriverFactory;
import com.sdet.pom.FlightPOMExpedia;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// ctrl + shift + o windows 
// cmt + shift + o mac 

public class ExpediaStep {
	
	private FlightPOMExpedia flightPOM; 
	private WebDriver driver; 
	private String baseUrl="https://www.expedia.com/";
	
	
	// background 
	@Given("^open web application expedia on chrome browser$")
	public void open_web_application_expedia_on_chrome_browser() throws Throwable {
		driver = DriverFactory.getDriver("chrome");
	}

	@Given("^load airline pom$")
	public void load_airline_pom() throws Throwable {
		 flightPOM = new FlightPOMExpedia(driver); 
		 driver.get(baseUrl);
	}

	// scenario 
	@Given("^goto flights tab on home page$")
	public void goto_flights_tab_on_home_page() throws Throwable {
		 flightPOM.clickFlightTab();
	}

	@When("^flying from Bengaluru to washingto DC$")
	public void flying_from_Bengaluru_to_washingto_DC() throws Throwable {
		flightPOM.sendFlyFrom("Bengaluru, India (BLR-Kempegowda Intl.)");
		flightPOM.sendFlyTo("Washington, DC (IAD-Washington Dulles Intl.)");
	}

	@When("^departing date on (\\d+)$")
	public void departing_date_on(int arg1) throws Throwable {
	 
		flightPOM.sendDepartingDate(new Integer(arg1).toString());
	}

	@When("^return date on (\\d+)$")
	public void return_date_on(int arg1) throws Throwable {
		flightPOM.sendReturningDate(new Integer(arg1).toString());
	}

	@When("^(\\d+) adults travelling$")
	public void adults_travelling(int arg1) throws Throwable {
		 flightPOM.clickNumberOfTravellers(arg1);
	}

	@When("^search the flights available$")
	public void search_the_flights_available() throws Throwable {
		 flightPOM.clickSearchBtn();
	}

	@Then("^select the cheapest flight$")
	public void select_the_cheapest_flight() throws Throwable {
		 System.out.println("... TODO... get all the flight's in the list ");
	}

}
