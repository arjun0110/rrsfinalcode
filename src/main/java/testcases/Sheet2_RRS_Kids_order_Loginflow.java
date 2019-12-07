package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_RRS_Kids_order_Loginflow  extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Orders for kids - login flow";
		testDescription="Verify the orders flow after login";
		testNodes="PDP";
		category="Regression";
		authors="arjun";
		browserName="chrome";
		dataSheetName="kidsorderlogin";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void orderswithLoginforkids(String email, String password,String brandname)  {
		
		
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
			.choosecolorofshoe()
			.choosesizeofshoe()
			.addtocartkids()
			
		
			.viewcartkids()
			.viewCartforkid();
			//.emailsection()
			//.shippingsection()
			//billingsection()
		
			//.placeorderButtonclick()
			//.orderConfirmationmessage();
			
			
			
	}

}
