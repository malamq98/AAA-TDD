package homePageTest;

import org.testng.annotations.Test;

import base.TestBase;

public class TestCruises extends TestBase {

	@Test

	public void validateCruisesTab() {
		cruises.clickOnCruisesTab();
		cruises.validateTitle("Book your cruise with us and save");
		cruises.selectDestination("Bahamas");
		cruises.selectCruiseLine("Carnival");
		cruises.selectDuration("1 To 2 Nights");
		cruises.selectDate("Jan 2024");
		cruises.selecteNumbersOfTravelers("4");
		cruises.clickOnSearchButton();
	}

}
