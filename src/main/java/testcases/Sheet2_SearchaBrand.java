package testcases;

import org.testng.annotations.Test;
import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_SearchaBrand extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Search a brand name";
		testDescription="Verify if brand is present or not";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void seachaBrand(String xpath,String brandname) throws AWTException {
		
		new HomePage_RRS()
		.entersearchkey(xpath,brandname);
	
	}





}
