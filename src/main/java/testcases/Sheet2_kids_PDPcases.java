package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_kids_PDPcases  extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="PDP cases for kids";
		testDescription="Verify the PDP cases for kids";
		testNodes="PDP";
		category="Regression";
		authors="arjun";
		browserName="chrome";
		dataSheetName="kidsorderlogin";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void PDPkids(String email, String password,String brandname)  {
		
		
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
			.clickproductlinksecondtimekid()
			.verifyitem()
			.verifymsrpkid()
			.verifynowprice()
			.verifyvipprice()
			.verifyquantity()
			.verifyquantitydropdown()
			//.maxandminimage()
			.verifydescription()
			.verifyreviewskids()
			.verifyvideoskids()
			.verifyrecommended();

}
}