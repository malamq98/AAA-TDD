package homePageTest;

import org.testng.annotations.Test;

import base.TestBase;

public class TestAAAhomePage extends TestBase{

	@Test
	
	public void testHomePage() {
        homePage.clickOnGetAutoQuoteBtn();
		homePage.insertFirstName("Md");
	    homePage.insertLastName("Alam");
	    homePage.clickOnNextBtn();
	    homePage.insertBirthDate("05/05/1994");
	    homePage.selectGender("M");
	    homePage.insertAgeInFirsrLicensed("20");
	    homePage.selectMaritalStatus("Married");
	    homePage.clickOnNext();
	    logIn.clickOnRegisterBtn();
	    logIn.clickOnRegister();
	    logIn.clickOnNext();
	    logIn.validateErrorAlert("Member Number is required");
	    logIn.insertMemberId("12345678");
	    logIn.insertZipCode("76227");
	    
	    
	    
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
