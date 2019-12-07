package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet3_SitePersonalisation_PreviousshorepurchaseandNextModel extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Verify the Previous shoe purchase and Next Model flow ";
		testDescription="Verify the Previous shoe purchase and Next Model flow ";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="previous";
	}
	@Test(dataProvider="fetchData")
	public void NextShorePurchase(String email, String password)  {
		
		new HomePage_RRS()
		.clickaccount()
		.enteremail(email)
		.clickNext()
		.enterpassword(password)
		.login()
		.accountcreation()
		.clickLogo()
		.welcometext()
		//.previousorder()
		//.nextorder()
		//.chooseashoe()
		.clickLogo()
		.accessories()
		.chooseanInsole()
		.clickLogo();
		//.recentprod();
		
		
		
	}
}