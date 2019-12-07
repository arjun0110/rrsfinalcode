package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet3_SmartGift_VerifySmartGiftOption extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Verify the smart gift option";
		testDescription="Verify the smart gift option";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="giftsheet3";
		
		
	}
	
	
	@Test(dataProvider="fetchData")
	public void smartGiftoption(String brandname,String name)
	{
		new HomePage_RRS()
		
		.entersearch(brandname)
		.clickproductlinksecondtime()
		.choosecolorforsecondproduct()
		.choosesize()
		.viewgift()
		.clickcategory()
		.shoeselect()
		.viewgifts();
		
	}
	

}
