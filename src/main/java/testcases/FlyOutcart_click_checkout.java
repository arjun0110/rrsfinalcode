package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class FlyOutcart_click_checkout extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Verify the flyout cart feature by clicking checkout button";
		testDescription="Verify if flyout cart feature is working fine as expected";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC029";
		
		
	}
	
	@Test
	public void flyoutcart_checkout()  {
		
		
		new HomePage_RRS()
		.searchbrands()
		.garmin()
		.clickgarminproduct()
		.choosegarmincolor()
		
		.addtocartflycart()
		.verifyflycart()
		.clickcheckout();
	}

}
