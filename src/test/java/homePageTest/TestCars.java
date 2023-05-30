package homePageTest;

import org.testng.annotations.Test;

import base.TestBase;

public class TestCars extends TestBase {

	@Test
	public void validateCarsTab() {
		cars.clickOnCarsTab();
		cars.validateTitle("Book your rental car with us and save");
		cars.insertPickUpLocation("Frisco, Texas, United States");
		cars.selectPickUpDate("05/31/2023");
		cars.selectPickUpTime("10:00 a.m.");
		cars.selectReturnDate("06/01/2023");
		cars.selectReturnTime("10:00 a.m.");
		cars.clickOnSearchBtn();

	}

}
