package objects;

import static common.CommonWaits.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static common.CommonActions.*;

public class Packages {
	WebDriver driver;

	public Packages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		init(driver);
	}
	
	@FindBy(xpath = "//button[@id=\"travelWidgetPackagesTab\"]")
	WebElement packagesTab;

	@FindBy(xpath = "//div[@id=\"travelWidgetPackagesFormHeader\"]")
	WebElement title;

	@FindBy(xpath = "//div[@id=\"packageType\"]")
	WebElement packageType;

	@FindBy(xpath = "//input[@id=\"packageLeavingFrom\"]")
	WebElement leavingFrom;

	@FindBy(xpath = "//input[@id=\"packageGoingTo\"]")
	WebElement goingTo;

	@FindBy(xpath = "//input[@id=\"packagesDeparting\"]")
	WebElement deaprtingDate;

	@FindBy(xpath = "//input[@id=\"packagesReturning\"]")
	WebElement returingDate;
	
	public void clickOnPackagesTab() {
		click(packagesTab);
	}

	public void validateTitle(String expected) {
		waitUntilVisible(title);
		Assert.assertEquals(getText(title), expected);

	}

	public void selectPackageType(String type) {
		dropdown(packageType, type);
	}

	public void insertLocationInLeavingFrom(String location) {
		insert(leavingFrom, location);
	}

	public void insertLocationinGoingToFld(String location) {
		insert(goingTo, location);
	}

	public void selecetDeaprtingDate(String date) {
		dropdown(deaprtingDate, date);
	}

	public void selectReturingDate(String date) {
		dropdown(returingDate, date);
	}

}
