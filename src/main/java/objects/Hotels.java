package objects;

import static common.CommonWaits.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class Hotels {

	WebDriver driver;

	public Hotels(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		init(driver);
	}

	@FindBy(xpath = "//button[@id=\"travelWidgetHotelsTab\"]")
	WebElement hotels;

	@FindBy(xpath = "//input[@id=\"hotelsDestination\"]")
	WebElement destinationFld;

	@FindBy(xpath = "//div[@id=\"hotelsRooms\"]")
	WebElement roomsFld;

	@FindBy(xpath = "//input[@id=\"hotelsCheckIn\"]")
	WebElement checkIn;

	@FindBy(xpath = "//input[@id=\"hotelsCheckOut\"]")
	WebElement check_out;

	@FindBy(xpath = "//button[@id=\"hotelsSearch\"]")
	WebElement searchBtn;

	public void clickOnHotelsTab() {
		click(hotels);
	}

	public void insertLocationInDestiantionFld(String location) {
		insert(destinationFld, location);
	}

	public void select_numbersOf_rooms(String value) {
		insert(roomsFld, value);
	}

	public void select_date_checkIn(String date) {
		dropdown(checkIn, date);
	}

	public void select_check_out_date(String date) {
		dropdown(check_out, date);
	}

	public void clickOnSearchBtn() {
		click(searchBtn);
	}

}
