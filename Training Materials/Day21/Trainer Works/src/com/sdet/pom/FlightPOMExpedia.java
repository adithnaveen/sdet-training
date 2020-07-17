package com.sdet.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPOMExpedia {

	WebDriver driver;

	public FlightPOMExpedia(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "tab-flight-tab-hp")
	WebElement flightsTab;

	@FindBy(id = "flight-origin-hp-flight")
	WebElement flyginFrom;

	@FindBy(id = "flight-destination-hp-flight")
	WebElement flyingTo;

	// there shall be two action first to click on
	// departing date and click on the date given

	@FindBy(id = "flight-departing-hp-flight")
	WebElement departingDate;

	@FindBy(id = "flight-returning-hp-flight")
	WebElement returningDate;

	@FindBy(xpath = "//*[@id='gcw-flights-form-hp-flight']/fieldset[2]/div/div[4]/div/div/ul/li/button")
	WebElement numberOfTravellers;

	@FindBy(xpath = "//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button")
	WebElement searchBtn;

	public void clickFlightTab() {
		this.flightsTab.click();
	}

	public void sendFlyFrom(String flyFrom) {
		this.flyginFrom.clear();
		this.flyginFrom.sendKeys(flyFrom);
	}

	public void sendFlyTo(String flyTo) {
		this.flyingTo.clear();
		this.flyingTo.sendKeys(flyTo);
	}

	public void sendDepartingDate(String departDate) {
		this.departingDate.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String xpathSelectionDate = ".//*[@id='flight-departing-wrapper-hp-flight']"
				+ "/div/div/div[2]/table/tbody/tr/td/button[text()='" + departDate + "']";

		driver.findElement(By.xpath(xpathSelectionDate)).click();
	}

	public void sendReturningDate(String returnDate) {
		this.returningDate.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		String xpathSelectionDate = ".//*[@id='flight-returning-wrapper-hp-flight']"
				+ "/div/div/div[2]/table/tbody/tr/td/button[text()='" + returnDate + "']";

		driver.findElement(By.xpath(xpathSelectionDate)).click();
	}

	public void clickNumberOfTravellers(int numberOfTravellers) {
		this.numberOfTravellers.click();
		for (int i = 0; i < numberOfTravellers; i++) {

			String incrementAdults = "//*[@id='gcw-flights-form-hp-flight']/fieldset[2]"
					+ "/div/div[4]/div/div/ul/li/div/div/div/div[1]/div[4]/button/span[1]";

			driver.findElement(By.xpath(incrementAdults)).click();
			
		}
	}

	public void clickSearchBtn(){
		this.searchBtn.click();
	}
	
	
}
