package homePageTest;

import org.testng.annotations.Test;

import base.TestBase;

public class TestLogIn extends TestBase {
@Test
	public void validatelogIn() {
    logIn.clickOnRegisterBtn();
    logIn.clickOnRegister();
    logIn.clickOnNext();
    logIn.validateErrorAlert("Member Number is required");
    logIn.insertMemberId("12345678");
    logIn.insertZipCode("76227");
	
	}
	
	
	
	
	
	
	
}
