package homePageTest;

import org.testng.annotations.Test;

import base.TestBase;

public class TestHotels extends TestBase {
	@Test
	public void validateHotelsTab() {
		hotels.clickOnHotelsTab();
		hotels.validateTitle("Book your hotel stay with us and save");
		hotels.insertLocationInDestiantionFld("Queens, NY, USA");
		hotels.select_numbersOf_rooms("2");
		hotels.select_date_checkIn("5/31/2023");
		hotels.select_check_out_date("06/01/2023");
		hotels.validateErrorMessage("Destination Required");
		hotels.validateCheckInErrorMessage("Check-in Required");
		hotels.clickOnSearchBtn();
		
	}

}
