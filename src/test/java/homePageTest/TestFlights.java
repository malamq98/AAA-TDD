package homePageTest;

import org.testng.annotations.Test;

import base.TestBase;

public class TestFlights extends TestBase {
	@Test
	public void validateFlightsTab() {
		flights.clickOnFlightsTab();
		flights.clickOneWay();
		flights.insert_in_flying_from_fld("Dallas Area Airports (DFW)");
		flights.insert_in_going_to_fld("John F Kennedy International Airport (JFK), New York, NY");
		flights.selectDepartingDate("05/31/2023");
		flights.selec_numbers_of_adults("3");
		flights.select_numbers_of_children("0");
		flights.clickOnSearchBtn();

	}

}
