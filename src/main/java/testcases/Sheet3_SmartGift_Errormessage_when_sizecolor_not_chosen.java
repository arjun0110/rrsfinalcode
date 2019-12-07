package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet3_SmartGift_Errormessage_when_sizecolor_not_chosen extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Verify the error message when the size/color not chosen";
		testDescription="Verify the error message when the size/color not chosen";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="giftcase2";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void gifterror(String email1, String password1,String brandname)  {
		
		
		new HomePage_RRS()
		.clickaccount()
		.enteremail(email1)
		.clickNext()
		.enterpassword(password1)
		.login()
		.accountcreation()
		.entersearch(brandname)
		.clickproductlinksecondtime()
		
			.clickgiftlinks();
	}
}
