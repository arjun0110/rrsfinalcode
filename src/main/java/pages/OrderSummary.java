package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class OrderSummary extends ProjectMethods{
	
	public OrderSummary() {		
		PageFactory.initElements(driver,this);
	
}
	
	
	public OrderSummary enteremail(String xpaths, String anme) {
		
		explicitWaitsend(xpaths, anme);
		return this;
	}

	@FindBy(how=How.XPATH,using="//*[contains(@title,'Please enter a valid email address')]")
	private WebElement emails;
public OrderSummary enteremails() {
		
		type(emails,"arj@gmail.com");
		return this;
	}


@FindBy(how=How.XPATH,using="//*[@title='Please enter a valid phone number']")
private WebElement phones;
public OrderSummary enterphones() {
	
	type(phones,"7845269020");
	return this;
}

@FindBy(how=How.XPATH,using="//*[@id='firstname']")
private WebElement fname;
public OrderSummary fnamee() {
	
	type(phones,"arjun");
	return this;
}

@FindBy(how=How.XPATH,using="//*[@id='lastname']")
private WebElement lname;
public OrderSummary lnamee() {
	
	type(phones,"kumar");
	return this;
}


		
	public OrderSummary enterphonenumber(String xpaths, String number) {
		
		explicitWaitsend(xpaths, number);
		return this;
	}
	
	
	
		@FindBy(how=How.XPATH,using="//*[contains(@id,'firstname')]")
		private WebElement firstname;
			
			public OrderSummary firstnamefield(String name) 
			{
				
				type(firstname, name);
				return this;
			}
			
			
			@FindBy(how=How.XPATH,using="//*[contains(@id,'lastname')]")
			private WebElement lastname;
				
				public OrderSummary lastnamefield(String lname) 
				{
					
					type(lastname, lname);
					return this;
				}
			
				
				@FindBy(how=How.XPATH,using="//*[contains(@id,'AddressIdMap')]")
				private WebElement address;
					
					public OrderSummary enteraddress(String addressfield) 
					{
						
						typewithtab(address, addressfield);
						
						
						return this;
					}
					
					@FindBy(how=How.XPATH,using="//*[contains(@title,'Please select your state in shipping address')]")
					private WebElement state;
						
						public OrderSummary statefield(String stat) 
						{
							
							typewithtab(state, stat);
							
							
							return this;
						}
					
					@FindBy(how=How.XPATH,using="//*[contains(@title,'Please enter your city name in shipping address')]")
					private WebElement city;
						
						public OrderSummary cityfield(String cityname) 
						{
							
							type(city, cityname);
							return this;
						}
					
						@FindBy(how=How.XPATH,using="//*[@id='postal_code' and @title='shipping address']")
						private WebElement zipcode;
							
							public OrderSummary zipfield(String citynazipme) 
							{
								
								type(zipcode, citynazipme);
								return this;
							}
							
							@FindBy(how=How.XPATH,using="//*[contains(@id,'cardHolderName')]")
							private WebElement nameoncard;
								
								public OrderSummary entercardname(String name) 
								{
									
									type(nameoncard, name);
									return this;
								}
					
								@FindBy(how=How.XPATH,using="//*[contains(@id,'cc-number')]")
								private WebElement cardnumber;
									
									public OrderSummary carddetails(String card) 
									{
										
										type(cardnumber, card);
										return this;
									}
						
									@FindBy(how=How.XPATH,using="//select[@id='cc_expire_yr']")
									private WebElement expiry;
										
										public OrderSummary expiryyear(String year) 
										{
											
											selectDropDownUsingText(expiry,year);
											return this;
										}	
										
										
										@FindBy(how=How.XPATH,using="//*[contains(@id,'cc_cvn')]")
										private WebElement cvn;
										
										public OrderSummary cvnfield(String cvv) 
										{
											
											type(cvn, cvv);
											return this;
										}
										
										@FindBy(how=How.XPATH,using="//*[contains(@class,'col span_2_of_3 first-child-margin giftcard-dropdown')]")
										private WebElement giftcard;
											
											public OrderSummary giftcardexpand() 
											{
												highLighterMethod(driver, giftcard);
												click(giftcard);
												return this;
											}
											
											@FindBy(how=How.XPATH,using="//*[contains(@id,'giftcard-number')]")
											private WebElement entercard;
												
												public OrderSummary entergiftcard(String gift) 
												{
													
													type(entercard,gift);
													return this;
												}
												
												
												@FindBy(how=How.XPATH,using="//*[contains(@id,'promo-number-fld')]")
												private WebElement coupon;
												@FindBy(how=How.XPATH,using="//*[contains(@onclick,'applyPromotion()')]")
												private WebElement apply1;
												
												public OrderSummary entercouponcodes(String code) 
												{
													
													type(coupon,code);
													click(apply1);
													
													
													return this;
												}
												
												@FindBy(how=How.XPATH,using="//*[contains(@id,'giftcard-cvnnumber')]")
												private WebElement enterpin;
													
													public OrderSummary enterpinnumber(String pin) 
													{
														
														type(enterpin,pin);
														return this;
													}
													
													@FindBy(how=How.XPATH,using="//*[contains(@class,'giftcard-btn')]")
													private WebElement apply;
														
														public OrderSummary clickapply() 
														{
															
															click(apply);
															return this;
														}
													
													
													
											
											public OrderSummary giftcardcollapse() 
											{
												
												click(giftcard);
												return this;
											}
											@FindBy(how=How.XPATH,using="//*[contains(@id,'reviewOrder')]")
											private WebElement orderreview;
												
												public OrderPlacing revieworder() 
												{
													
													click(orderreview);
													return new OrderPlacing();
												}
												
												@FindBy(how=How.XPATH,using="//*[contains(@id,'editforgcsp')]")
												private WebElement editlink;
													
													public OrderSummary clickedit() 
													{
														
														click(editlink);
														return this;
													}
									
									
													@FindBy(how=How.XPATH,using="//*[contains(@for,'ccard-chk')]/div")
													private WebElement unchk;
														
														public OrderSummary creditcard() 
														{
															
															click(unchk);
															return this;
														}
										
										
									
									
									
									
									
									
									
			
			
}