package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewCart extends ProjectMethods{
	
	public ViewCart() {		
		PageFactory.initElements(driver,this);
	
}
	
	
	@FindBy(how=How.XPATH,using="//*[@alt='Road Runner Sports']")
	private WebElement banner;
	@FindBy(how=How.XPATH,using="//*[@class='account-user']")
	private WebElement account;	
	
	@FindBy(how=How.XPATH,using="//*[text()='Your Account']")
	private WebElement myacc;	
	
public ViewCart clickmyaccount() {
		mouseHover(account);
		click(myacc);
		return this;
	}
	
	public ViewCart clickBanner() {
		
		click(banner);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[text()='Redeem Now']")
	private WebElement redeem;
	
	@FindBy(how=How.XPATH,using="//*[text()='Use Online Now']")
	private WebElement online;
public ViewCart clickredeem() {
	highLighterMethod(driver, redeem);
		click(redeem);
		highLighterMethod(driver, online);
		click(online);
		return this;
	}
	
	
@FindBy(how=How.XPATH,using="//*[@id='shoppingCartSummaryNew']")
private WebElement cart;

@FindBy(how=How.XPATH,using="//*[@class='fa fa-times-circle tooltip']")
private WebElement delete;

public ViewCart deleteproduct() {
	
	
		click(delete);
		return this;
	}

public ViewCart clickcart() {
	
	refresh();
		click(cart);
		return this;
	}

@FindBy(how=How.XPATH,using="//*[@class='reward-cash-row-0']")
private WebElement awards;
@FindBy(how=How.XPATH,using="//*[text()='remove']")
private WebElement remove;

public ViewCart redeemcash() {
	highLighterMethod(driver, awards);
	highLighterMethod(driver, remove);
	click(remove);
	return this;
}


	@FindBy(how=How.XPATH,using="//*[contains(@class,'top-cart-title-tile')]")
	private WebElement cartsuccessmessage;
	
	
	public ViewCart verifycarttitle() 
	{
		
		verifyDisplayed(cartsuccessmessage);
		highLighterMethod(driver, cartsuccessmessage);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@value='PLACE YOUR ORDER']")
	private WebElement placeord;
	
	
	public ViewCart placeOrder() 
	{
		
		refresh();
		highLighterMethod(driver, placeord);
		click(placeord);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"rplus-rebuttal-cta-container\"]/div[2]/a/div/p")
	private WebElement close;
	public ViewCart closebutton() 
	{
		
		
		highLighterMethod(driver, close);
		JavascriptExecutor js = driver;
		js.executeScript("arguments[0].click();", close);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'search2 ui-autocomplete-input')]")
	private WebElement searchfield;
	
	@FindBy(how=How.XPATH,using="//div[@id='specialist2']/div/form/div/input[@value='SEARCH']")
	private WebElement searchbutton;
	

	
	public Searchresults entersecondproduct(String data)
	{


		
		
		verifyDisplayed(searchfield);
		
		type(searchfield, data);
		
		click(searchbutton);
		return new Searchresults();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'getThisPrice') and contains(@class,'get-this-vip-price')]")
	private WebElement getthispricelink;
	
	public ViewCart getthisprice() 
	{
		
		verifyDisplayed(getthispricelink);
		highLighterMethod(driver, getthispricelink);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'vip-price-lbl')]")
	private WebElement viplink;
	
	public ViewCart vip() 
	{
		
		verifyDisplayed(viplink);
		highLighterMethod(driver, viplink);
		return this;
	}
	@FindBy(how=How.XPATH,using="//*[@id='total-commerce-item-cart_count']")
	private WebElement items;	
	public ViewCart verifyItems() 
	{
		
	verifyExactText(items, "2 items");
		highLighterMethod(driver, viplink);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'checkout_guest checkout-guest-wrap-btn')]")
	private WebElement guest;
	
	public ViewCart clickGuest() 
	{
		
		click(guest);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'header-back-button')]/a")
	private WebElement editbutton;
	
	public UserCreatedConfirmation clickshopping() 
	{
		highLighterMethod(driver, editbutton);
		click(editbutton);
		return new UserCreatedConfirmation();
	}
	
	
	
	
	
	
	public ViewCart guestbutton() 
	{
		
		verifyDisplayed(guest);
		highLighterMethod(driver, guest);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'signin-button')]")
	private WebElement signin;
	
	public ViewCart signinbutton() 
	{
		
		verifyDisplayed(signin);
		highLighterMethod(driver, signin);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'ajaxasync pod5')]/button")
	private WebElement paypal;
	
	public ViewCart paypalbutton() 
	{
		
		verifyDisplayed(paypal);
		highLighterMethod(driver, paypal);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'vip-rebutal-btn')]")
	private WebElement withoutvip;
	
	public ViewCart withoutvipbutton() 
	{
		
		verifyDisplayed(withoutvip);
		highLighterMethod(driver, withoutvip);
		return this;
	}
	
	public OrderSummary clickWithoutVip() 
	{
		click(withoutvip);
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return new OrderSummary();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@title,'Click Now to Join and Save!')]")
	private WebElement withvip;
	
	public ViewCart withvipbutton() 
	{
		
		verifyDisplayed(withvip);
		highLighterMethod(driver, withvip);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'get-vip-savings-wrap')]")
	private WebElement viplinks;
	
	public ViewCart vipbutton() 
	{
		
		verifyDisplayed(viplinks);
		highLighterMethod(driver, viplinks);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'have-promo-cards')]")
	private WebElement offers;
	
	public ViewCart offercode() 
	{
		
		verifyDisplayed(offers);
		highLighterMethod(driver, offers);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'signin-button')]")
	private WebElement placingorder;
	
	public OrderSummary placeanorder() 
	{
		
		click(placingorder);
		
		return new OrderSummary();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='clickButton' and @value='PLACE YOUR ORDER']")
	private WebElement ordrbutton;
	
	public verifyOrder placeorderButtonclick()
{
		highLighterMethod(driver, ordrbutton);
		click(ordrbutton);
		
		return new verifyOrder();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'header-bars email-header')]")
	private WebElement emailsec;
	
	public ViewCart emailsection() 
	{
		
		verifyDisplayed(emailsec);
		highLighterMethod(driver, emailsec);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'header-bars shipping-header')]")
	private WebElement shipsec;
	
	public ViewCart shippingsection() 
	{
		
		verifyDisplayed(shipsec);
		highLighterMethod(driver, shipsec);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'header-bars billing-header')]")
	private WebElement billsec;
	
	public ViewCart billingsection() 
	{
		
		verifyDisplayed(billsec);
		highLighterMethod(driver, billsec);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'promo-number-fld')]")
	private WebElement coupon;
	@FindBy(how=How.XPATH,using="//*[contains(@onclick,'applyPromotion()')]")
	private WebElement apply;
	
	public ViewCart entercouponcode(String code) 
	{
		highLighterMethod(driver, coupon);
		type(coupon,code);
		click(apply);
		
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'rrsglobalnav-womens')]/p")
	private WebElement category;
	@FindBy(how=How.XPATH,using="//*[(@href='/rrs/category/womens-racing-shoes/')]")
	private WebElement subcategory;
	
	
	public ViewCart clickcategory() 
	{
		
		mouseHover(category);
		mouseHover(subcategory);
		click(subcategory);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'26026_img')]")
	private WebElement chooseshoe;
	
	@FindBy(how=How.XPATH,using="//*[contains(@title,'Black/White')]")
	private WebElement color;
	@FindBy(how=How.XPATH,using="//*[contains(@id,'Size;5')]")
	private WebElement size;
	public ViewCart shoeselect() 
	{
		
		click(chooseshoe);
		click(color);
		click(size);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='smartGift']")
	private WebElement giftlinks;
	public HomePage_RRS viewgifts() 
	{
		
		
		
		verifyDisplayed(giftlinks);
		highLighterMethod(driver, giftlinks);
		
		
		
		return new HomePage_RRS();
	}
	
	
	
	
	
	
	
}
