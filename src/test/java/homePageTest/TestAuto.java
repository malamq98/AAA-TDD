package homePageTest;

import org.testng.annotations.Test;

import base.TestBase;

@Test
public class TestAuto extends TestBase {
	public void validateAutoQuote() {
		homePage.clickOnGetAutoQuoteBtn();
		homePage.insertFirstName("Md");
		homePage.insertLastName("Alam");
		homePage.clickOnNextBtn();
		homePage.insertBirthDate("05/05/1994");
		homePage.selectGender("M");
		homePage.insertAgeInFirsrLicensed("20");
		homePage.selectMaritalStatus("Married");
		homePage.clickOnNext();
	}

}
