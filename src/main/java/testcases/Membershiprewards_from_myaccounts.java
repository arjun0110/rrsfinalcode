package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Membershiprewards_from_myaccounts extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Orders";
		testDescription="Verify the rewards membership from my accounts";
		testNodes="PDP";
		category="Regression";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC030";
		
		
	}
	
	@Test
	public void orderswithLogin()  {
		
		
			new HomePage_RRS()
			.clickaccount()
			.enteremail("cgeddes@roadrunnersports.com")
			.clickNext()
			.enterpassword("Cameron12")
			.login()
			.accountcreation()
			.entersearch("r-gear")
			.clickproductlinksecondtime()
			.choosecolorforsecondproduct()
			.choosesize()
			.addtocart()
			.viewCart()
			.clickBanner()
			.clickmyaccount()
			.clickredeem()
			.clickcart()
			.redeemcash()
			.deleteproduct();
			
			
			
			

}
}
