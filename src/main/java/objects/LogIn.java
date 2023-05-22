package objects;

import static common.CommonWaits.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static common.CommonActions.*;

public class LogIn {
	
	
	public LogIn(WebDriver driver) {
		PageFactory.initElements( driver,this);
		init(driver);
	}
	
	@FindBy(xpath = "//span[text()='Register/Log in']")
	WebElement registerBtn;
	
	@FindBy(xpath = "(//a[@class=\"logged-out\" and text()= 'Log in'])[1]")
	WebElement register;
	
	@FindBy(xpath = "(//input[@type=\"submit\"])[1]")
	WebElement nextBtn;
	
	@FindBy(xpath = "//div[@id=\"valError_txtMemberNumber\"]")
	WebElement errorAlert;
	
	@FindBy(xpath = "id=\"txtMemberNumber\"")
	WebElement membershipFld;
	
	@FindBy(xpath = "//input[@name=\"ZipCode\"]")
	WebElement zipCodeFld;
	
	
	
	
	public void clickOnRegisterBtn() {
		click(registerBtn);
	}
	
	public void clickOnRegister() {
		click(register);
	}
	
	public void clickOnNext() {
		click(nextBtn);
	}
	
	public void validateErrorAlert(String expected) {
		waitUntilVisible(errorAlert);
		Assert.assertEquals(getText(errorAlert), expected);
	}
	
	public void insertMemberId(String id) {
		insert(membershipFld, id);
	}
	
	public void insertZipCode(String zipcode) {
		insert(zipCodeFld, zipcode);
	}
	
	
	
	
	
	

}
