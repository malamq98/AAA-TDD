package homePageTest;

import org.testng.annotations.Test;

import base.TestBase;

public class TestHomeQuote extends TestBase {
	@Test

	public void validateHomeQuote() {
		homeQuote.validateHomepageTitle("With AAA Texas, you could save hundreds on auto insurance");
		homeQuote.clickOnHomeTab();
		homeQuote.clickOnGetAquoteBtn();
		homeQuote.clickOnPropertyInformationBtn();
		homeQuote.validateAlertErrorMsg("Please correct the errors indicated below.");
		homeQuote.select_do_you_have_auto_policy("No");
		homeQuote.insertFirstName("Md");
		homeQuote.insertLastName("Alam");
		homeQuote.insertDateOfBirth("05/05/94");
		homeQuote.select_residence_coOwned("Yes");
		homeQuote.insertStreetAddress("4005 Rosin St");
		homeQuote.insertZipCode("76227");
		homeQuote.selectPhoneType("Mobile");
		homeQuote.insertPhoneNumInPhoneFld("123456789");
		homeQuote.insertEmailAddressInEmailFld("alam@html.com");
		homeQuote.clickOnPropertyInformation();
	}

}
