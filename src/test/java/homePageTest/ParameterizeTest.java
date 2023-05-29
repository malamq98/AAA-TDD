package homePageTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;

public class ParameterizeTest extends TestBase {

	@Parameters({ " firstName1", " lastName1", " dateOfBirth1", " gender1", " age1", " maritalStatus1" })//make sure don't mention variable type here

	@Test(enabled = true)

	public void validateAutoQuote(String firstName, String lastName, String dateOfBirth, String gender, String age,
			String maritalStatus) {
		homePage.clickOnGetAutoQuoteBtn();
		homePage.insertFirstName(firstName);
		homePage.insertLastName(lastName);
		homePage.clickOnNextBtn();
		homePage.insertBirthDate(dateOfBirth);
		homePage.selectGender(gender);
		homePage.insertAgeInFirsrLicensed(age);
		homePage.selectMaritalStatus(maritalStatus);
		homePage.clickOnNext();
	}

}
