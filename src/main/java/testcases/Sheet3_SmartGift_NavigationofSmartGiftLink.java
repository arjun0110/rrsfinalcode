package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet3_SmartGift_NavigationofSmartGiftLink extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Verify the navation of smart gift link";
		testDescription="Verify the navation of smart gift link";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="giftcase2";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void giftnavigation(String email1, String password1,String brandname)  {
		
		
		new HomePage_RRS()
		.clickaccount()
		.enteremail(email1)
		.clickNext()
		.enterpassword(password1)
		.login()
		.accountcreation()
		.entersearch(brandname)
		.clickproductlinksecondtime()
		.choosecolorforsecondproduct()
		.choosesize()
			.clickgiftlink();
			
}
}