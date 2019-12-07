package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import wdMethods.ProjectMethods;

public class HomePage_RRS extends ProjectMethods{
	
	public HomePage_RRS() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[@href='/rrs/category/mens-hiking-shoes/']")
	private WebElement hiking;
	
	
	public HomePage_RRS moseuhovermen() {
		
		refresh();
		mouseHover(men);
		click(hiking);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='breadcrumbs']")
	private WebElement bread;
	
public HomePage_RRS verifybreadcrumbs() {
	
		verifyDisplayed(bread);
		highLighterMethod(driver, bread);
		return this;
	}

@FindBy(how=How.XPATH,using="//*[contains(text(),'Home /')]")
private WebElement home;

public HomePage_RRS clickhome() {
click(home);
	return this;
	
}

@FindBy(how=How.XPATH,using="//*[@id='Query']")
private WebElement search;

public HomePage_RRS verifyhomepage() {
verifyDisplayed(search);
	return this;
}

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Stay Connected')]")
	private WebElement connected;
	
	public HomePage_RRS verifystayconnected()
	{
		refresh();
		
		try {
			pageScrollbottom();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifyDisplayed(connected);
		highLighterMethod(driver, connected);
		return this;
	}
	

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Company Info')]")
	private WebElement companyinfo;
	
	public HomePage_RRS verifycompanyinfo()
	{
		
		verifyDisplayed(companyinfo);
		highLighterMethod(driver, companyinfo);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Customer Service')]")
	private WebElement customer;
	
	public HomePage_RRS verifycustomerservice()
	{
		try {
			pageScrollbottom();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifyDisplayed(customer);
		highLighterMethod(driver, customer);
		
		return this;
	}
	

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Further Information')]")
	private WebElement information;
	
	public HomePage_RRS verifyfurtherinformation()
	{
		
		verifyDisplayed(information);
		highLighterMethod(driver, information);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Gift Cards')]")
	private WebElement giftcr;
	
	public HomePage_RRS verifygiftcards()
	{
		
		verifyDisplayed(giftcr);
		highLighterMethod(driver, giftcr);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"rrs-footer-root\"]/section[2]/div[3]/h2")
	private WebElement vipfm;
	
	public HomePage_RRS verifyvipfamily()
	{
		
		verifyDisplayed(vipfm);
		highLighterMethod(driver, vipfm);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"feeds2\"]/h4[2]")
	private WebElement learn;
	
	public HomePage_RRS verifylearn()
	{
		
		verifyDisplayed(learn);
		highLighterMethod(driver, learn);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'We Care')]")
	private WebElement wecare;
	
	public HomePage_RRS verifywecare()
	{
		
		verifyDisplayed(wecare);
		highLighterMethod(driver, wecare);
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Site Info')]")
	private WebElement info;
	
	public HomePage_RRS verifysiteinfo()
	{
		
		verifyDisplayed(info);
		highLighterMethod(driver, info);
		
		return this;
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[@class='active_rrs']")
	private WebElement rrs;
	
	public HomePage_RRS verifyrrs()
	{
		
		try {
			pageScrollUp();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifyDisplayed(rrs);
		highLighterMethod(driver, rrs);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='default_kids']")
	private WebElement rrskid;
	
	@FindBy(how=How.XPATH,using="//*[@id='KanaLiveChatButton2']")
	private WebElement chat;
	
	public HomePage_RRS verifyrrskids()
	{
		
		verifyDisplayed(rrskid);
		highLighterMethod(driver, rrskid);
		verifyDisplayed(chat);
		highLighterMethod(driver, chat);
		return this;
	}
	

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Stores')]")
	private WebElement stores;
	
	@FindBy(how=How.XPATH,using="//*[@id='rrsglobalnav-mens']/a")
	private WebElement men;
	
	@FindBy(how=How.XPATH,using="//*[@id='rrsglobalnav-womens']/a")
	private WebElement women;
	
	@FindBy(how=How.XPATH,using="//*[@id='rrsglobalnav-kids']/a")
	private WebElement kids;
	
	@FindBy(how=How.XPATH,using="//*[@href='/rrs/accessories/']")
	private WebElement accessories;
	
	@FindBy(how=How.XPATH,using="//*[@id='rrsglobalnav-nutrition']/a")
	private WebElement nutrition;
	
	@FindBy(how=How.XPATH,using="//*[@id='rrsglobalnav-brands']/a")
	private WebElement brand;
	
	@FindBy(how=How.XPATH,using="//*[@href='/rrs/outlet/']")
	private WebElement sale;
	
	@FindBy(how=How.XPATH,using="//*[@href='/rrs/product/shoe-dog.jsp']")
	private WebElement fitfinder;
	
	@FindBy(how=How.XPATH,using="//*[text()='VIP FAMILY']")
	private WebElement vip;
	
	public HomePage_RRS verifymenu()
	{
		
		verifyDisplayed(men);
		highLighterMethod(driver, men);
		

		verifyDisplayed(women);
		highLighterMethod(driver, women);

		verifyDisplayed(kids);
		highLighterMethod(driver, kids);

		verifyDisplayed(accessories);
		highLighterMethod(driver, accessories);

		verifyDisplayed(nutrition);
		highLighterMethod(driver, nutrition);

		verifyDisplayed(brand);
		highLighterMethod(driver, brand);

		verifyDisplayed(sale);
		highLighterMethod(driver, sale);

		verifyDisplayed(fitfinder);
		highLighterMethod(driver, fitfinder);

		verifyDisplayed(vip);
		highLighterMethod(driver, vip);
		
		return this;
	}
	
	public HomePage_RRS outletclick()
	{
		
		
		highLighterMethod(driver, sale);
		click(sale);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='tile-bottom']")
	private WebElement menshoe;
	public HomePage_RRS clickmenshoe()
	{
		
		
		highLighterMethod(driver, menshoe);
		mouseHover(menshoe);
		click(menshoe);
		return this;
	}
	@FindBy(how=How.XPATH,using="//*[@class='product-image']")
	private WebElement firstprod;
	public HomePage_RRS clickfirstprod()
	{
		
		
		highLighterMethod(driver, firstprod);
	
		click(firstprod);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@name='8']")
	private WebElement chsize;
	@FindBy(how=How.XPATH,using="//*[contains(@id,'Width') and @name='Medium (Normal)']")
	private WebElement chwidth;
	public Productdetails choosesizeandwidth()
	{
		
		
		highLighterMethod(driver, chsize);
		click(chsize);
		highLighterMethod(driver, chwidth);
		click(chwidth);
	
	
		return new Productdetails();
	}
	
	public HomePage_RRS verifystores()
	{
		
		verifyDisplayed(stores);
		highLighterMethod(driver, stores);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='cart']")
	private WebElement cart;
	
	public HomePage_RRS verifycart()
	{
		
		verifyDisplayed(cart);
		highLighterMethod(driver, cart);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'My Account')]")
	private WebElement acc;
	
	public HomePage_RRS verifyaccount()
	{
		
		verifyDisplayed(acc);
		highLighterMethod(driver, acc);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='call-time']")
	private WebElement call;
	
	public HomePage_RRS verifycontact()
	{
		
		verifyDisplayed(call);
		highLighterMethod(driver, call);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='specialist2']/div/form/div/input[@value='SEARCH']")
	private WebElement searchbutton;
	
	public HomePage_RRS verifysearchbutton()
	{
		verifyDisplayed(searchbutton);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'FIT FINDER')]")
	private WebElement FIRELE;
	
	public FitFinder clickFitFinder()
	{
		refresh();
		click(FIRELE);
		return new FitFinder();
	}
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'search2 ui-autocomplete-input')]")
	private WebElement searchfield;
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'searchForm')]")
	private WebElement searchfieldkids;
	
	
	@FindBy(how=How.XPATH,using="//*[(@href='/rrs/brand/')]")
	private WebElement brands;
	
	public HomePage_RRS searchbrands()
	{
		refresh();
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@title,'R Gear, Shop Now')]")

	private WebElement rgear;
	
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),' Shop All R-Gear ')]")
	private WebElement rgearbrand;
	
	
	public Searchresults rgearbrand()
	{
		
		FluentWait();
		
		verifyDisplayed(searchfield);
		highLighterMethod(driver, searchfield);
		
		type(searchfield, "rgear");
		
		click(searchbutton);
		return new Searchresults();
	}

	@FindBy(how=How.XPATH,using="//*[contains(@title,'Garmin')]")
	private WebElement garminbrand;
	
	public Searchresults garmin() {
		
		click(garminbrand);
		return new Searchresults();
	}
	
	public Searchresults entersearchkey(String xpath,String data)
	{


		refresh();
		
		smallWait();
		verifyDisplayed(searchfield);
		
		explicitWaitsend(xpath,data);
		
		click(searchbutton);
		return new Searchresults();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='klaviyo_inline_fieldset']/input")
	private WebElement mail;
	
	@FindBy(how=How.XPATH,using="//*[@class='klaviyo_inline_fieldset']/button")
	private WebElement clicksubs;
	
	
	public Searchresults entersearchkeykids(String xpath,String data)
	{

		type(mail,"u.RJUNKUMr@gmail.com");
		click(clicksubs);
	
				
		smallWait();
	
		
		explicitWaitsend(xpath,data);
		
		clickenter();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Searchresults();
		
	}
	
	public Searchresults entersearchkeyandscrolltobottom(String data)
	{


		refresh();
		type(searchfield, data);
		
		click(searchbutton);
		scrollBottom();
		return new Searchresults();
		
	}

	@FindBy(how=How.XPATH,using="//*[text()='My Account']")
	private WebElement myaccountlink;
	
	public MyAccounts clickmyaccount()
	{
		refresh();
		click(myaccountlink);
		return new MyAccounts();
	}


	public Login clickaccount()
	{
		refresh();
		highLighterMethod(driver, myaccountlink);
		click(myaccountlink);
		return new Login();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'coop dual column')]")
	private WebElement shopnowlink;
	
	public ShopNow clickshopNow()
	{
		refresh();
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(shopnowlink);
		return new ShopNow();
	}
			
	@FindBy(how=How.XPATH,using="//*[contains(@class,'search2 ui-autocomplete-input')]")
	private WebElement searchfields;
	@FindBy(how=How.XPATH,using="//*[contains(@value,'SEARCH')]")
	private WebElement sbutton;	
	public ViewCart enterprodname(String name)
	{
		
		type(searchfields,name);
		click(sbutton);
		return new ViewCart();
	}
	
	@FindBy(how=How.XPATH,using="//*[text()='Stores']")
	private WebElement clickStores;
	
	public Stores storelink()
	{
		refresh();
		click(clickStores);
		return new Stores();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'chat-btn-header2')]")
	private WebElement clickchat;
	
	public Stores chatlink()
	{
		refresh();
		click(clickchat);
		return new Stores();
	}
	@FindBy(how=How.XPATH,using="//*[text()='KIDS']")
	private WebElement rrskids;
	
	public HomePage_RRS clickkidslink()
	{
		refresh();
		click(rrskids);
		return this;
	}
	
	public UserCreatedConfirmation clickkidslinks()
	{
		refresh();
		click(rrskids);
		return new UserCreatedConfirmation();
	}
	
	@FindBy(how=How.XPATH,using="//*[@href='/rrs/products/RAC55/']")
	private WebElement viplink;
	
	public HomePage_RRS vipfamily()
	{
		refresh();
		click(viplink);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='btn-copy']")
	private WebElement joinbutton;
	
	public Productdetails clickjoin()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(joinbutton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Productdetails();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='rrsmenubar2']/li[3]")
	private WebElement kidsbrand;
	
	public HomePage_RRS mousehoverbrands()
	{
		
		mouseHoverclick(kidsbrand);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@title='Asics']")
	private WebElement asics;
	
	public Searchresults clickasics()
	{
		
		click(asics);
		return new Searchresults();
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='specialist2']/div/form/div/input[@value='SEARCH']")
	private WebElement searchbuttons;

	
	public Searchresults entersearch(String data)
	{


		refresh();
		FluentWait();
		
		verifyDisplayed(searchfield);
		highLighterMethod(driver, searchfield);
		
		type(searchfield, data);
		
		click(searchbuttons);
		return new Searchresults();
		
	}
	
	
	
	
	

}