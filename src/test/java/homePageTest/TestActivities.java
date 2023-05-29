package homePageTest;

import org.testng.annotations.Test;

import base.TestBase;

public class TestActivities extends TestBase {

	@Test

	public void validateActivitiesTab() {
		activities.clickOnActivitiesTab();
		activities.validateTitle("Book your activities with us and save");
		activities.validateErrorMessage("Please select from list for destination");
		activities.insertDestination("Bahamas");
		activities.insertMonth("Jun2023");
		activities.clickOnSearchButton();
	}

}
