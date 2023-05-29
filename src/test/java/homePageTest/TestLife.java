package homePageTest;

import org.testng.annotations.Test;

import base.TestBase;

public class TestLife extends TestBase{
	
	@Test
	public void validateLifeTab() {
		
		life.clickOnLifeTab();
		life.validateTitle("Life insurance to help secure your financial future");
		life.clickOnGetAQuoteBtn();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
