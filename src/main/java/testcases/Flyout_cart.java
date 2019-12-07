package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Flyout_cart extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Verify the flyout cart feature";
		testDescription="Verify if flyout cart feature is working fine as expected";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC020";
		
		
	}
	
	@Test
	public void flyoutcart()  {
		
		
			new HomePage_RRS()
			.searchbrands()
			.garmin()
			.clickgarminproduct()
			.choosegarmincolor()
			
			.addtocartflycart()
			.verifyflycart()
			.clickviewCart();
			
	}

}
