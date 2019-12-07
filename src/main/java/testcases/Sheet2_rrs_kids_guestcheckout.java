package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_rrs_kids_guestcheckout extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="Guest order for kids";
		testDescription="Verify the kids guest orders flow";
		testNodes="PDP";
		category="Regression";
		authors="arjun";
		browserName="chrome";
		dataSheetName="kidsguest";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void orders(String emailadd,String xpath,String email, String xp,String number, String firstname, String lname, String address, String cityname,String state, String zipcode, String cardname, String cardnumber, String year, String cvn)  {
		
		new HomePage_RRS()
		.clickkidslink()
		.mousehoverbrands()
		.clickasics()
		//.subscribe(emailadd)
		.clickproductlinkforkids()
		.choosecolorofshoe()
		.choosesizeofshoe()
		.addtocartkids()
		.viewcartkids()
		
		.guestchecout()
		//.verifycarttitle()
		//.guestbutton()
		//.signinbutton()
		//.paypalbutton()
		
		//.clickGuest()
		.withoutvipbutton()
		.withvipbutton()
		.clickWithoutVip()
		.enteremail(xpath,email)
		.enterphonenumber(xp,number)
		.firstnamefield(firstname)
		.lastnamefield(lname)
		.enteraddress(address)
		.cityfield(cityname)
		.statefield(state)
		.zipfield(zipcode)
		.entercardname(cardname)
		.carddetails(cardnumber)
		.expiryyear(year)
		.cvnfield(cvn)
		.giftcardexpand()
		.giftcardcollapse()
		.revieworder()
		.placeorderButton()
.orderConfirmationmessage();
		
		
		
		
	}
}
