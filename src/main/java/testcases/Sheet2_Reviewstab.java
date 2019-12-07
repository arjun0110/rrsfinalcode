package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_Reviewstab extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Reviews";
		testDescription="Verify whether reviews are present or not";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC022";
		
		
	}
	
	@Test
	public void reviews() {
		
		
			new HomePage_RRS()
			.searchbrands()
			.rgearbrand()
			
			.clickproductlink()
			
			.reviewsTab();
}
}
