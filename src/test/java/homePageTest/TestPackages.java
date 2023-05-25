package homePageTest;

import org.testng.annotations.Test;

import base.TestBase;
import objects.Packages;

public class TestPackages extends TestBase {

	@Test
	public void validatePackageType() {
		packages.clickOnPackagesTab();
		packages.validateTitle("Book your vacation with us and save");
		packages.selectPackageType("Hotel + Car");
		packages.insertLocationInLeavingFrom("Austin, Texas");
		packages.insertLocationinGoingToFld("Baha Mar, Bahamas");
		packages.selecetDeaprtingDate("05/31/2023");
		packages.selectReturingDate("06/01/2023");

	}

}
