package testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_kidsSearch extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Search in kids's section";
		testDescription="Verify the search in kids section";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="kidsorderlogin";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void search(String email, String password,String brandname)  {
		
		
			new HomePage_RRS()
			.clickaccount()
			.enteremail(email)
			.clickNext()
			.enterpassword(password)
			.login()
			.accountcreations()
			.clickkidslinks()
			//.subscribe(email)
			.entersearchkid("asics")
			.entersearchkid1("GEL-Cumulus 20")
			
			.entersearchkid1("invalid");
	}



}
