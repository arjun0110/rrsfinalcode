package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_Kids_PLPcases  extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Kid's PLP cases";
		testDescription="Verify the kid's PLP cases";
		testNodes="PDP";
		category="Regression";
		authors="arjun";
		browserName="chrome";
		dataSheetName="kidsplp";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void PLPkids(String email, String password,String brandname)  {
		
		
			new HomePage_RRS()
			.clickaccount()
			.enteremail(email)
			.clickNext()
			.enterpassword(password)
			.login()
			.accountcreations()
			.clickkidslinks()
			//.subscribe(email)
			.entersearchkid(brandname)
			.verifysort()
			.verifygender()
			.verifyage()
			.verifysize()
			.verifycategory()
			.verifycategories()
			.verifybrand()
			.verifyshoewidth()
			.verifyprice()
			.verifycolor()
			.verifysale();
			
			
			
	}
}
