package pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



import wdMethods.ProjectMethods;

public class Searchresults extends ProjectMethods{
	
	public Searchresults() {		
		PageFactory.initElements(driver,this);
	
}

	@FindBy(how=How.XPATH,using="//*[contains(@id,'Kids Gender')]/h3")
private WebElement gender;
	
	public Searchresults verifygender() 
	{
	
		verifyDisplayed(gender);
		highLighterMethod(driver, gender);
		return this;
	}

	@FindBy(how=How.XPATH,using="//*[@class='product-image']")
	private WebElement garminfirstproduct;
		
		public Productdetails clickgarminproduct() 
		{
		
			
		   click(garminfirstproduct);
			return new Productdetails();
		}
		
	@FindBy(how=How.XPATH,using="//*[contains(@id,'Age Group')]/h3")
	private WebElement age;
	
	@FindBy(how=How.XPATH,using="//*[@id='view-sort']")
	private WebElement sort;
	
	public Searchresults verifysort() 
	{
		highLighterMethod(driver, sort);
		click(sort);
		robotpressdown();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'Categories')]/h3")
	private WebElement categories;
	
	public Searchresults verifycategories() 
	{
		highLighterMethod(driver, categories);
		click(categories);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(categories);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'Brand')]/h3")
	private WebElement brand;
	
	public Searchresults verifybrand() 
	{
		highLighterMethod(driver, brand);
		click(brand);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(brand);
		return this;
	}
	

	@FindBy(how=How.XPATH,using="//*[contains(@id,'Shoe Width')]/h3")
	private WebElement shoewidth;
	
	public Searchresults verifyshoewidth() 
	{
		highLighterMethod(driver, shoewidth);
		click(shoewidth);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(shoewidth);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'Price')]/h3")
	private WebElement price;
	
	public Searchresults verifyprice() 
	{
		highLighterMethod(driver, price);
		click(price);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(price);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'Color')]/h3")
	private WebElement color;
	
	public Searchresults verifycolor() 
	{
		highLighterMethod(driver, color);
		click(color);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(color);
		return this;
	}
	@FindBy(how=How.XPATH,using="//*[contains(@id,'Sale')]/h3")
	private WebElement sale;
	
	public Searchresults verifysale() 
	{
		highLighterMethod(driver, sale);
		click(sale);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(sale);
		return this;
	}
	
	

	
	
	public Searchresults verifyage() 
	{
	
		verifyDisplayed(age);
		highLighterMethod(driver, age);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'Shoe Size')]/h3")
	private WebElement size;
	
	public Searchresults verifysize() 
	{
	
		verifyDisplayed(size);
		highLighterMethod(driver, size);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'Category')]/h3")
	private WebElement category;
	
	
	public Searchresults verifycategory() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifyDisplayed(category);
		highLighterMethod(driver, category);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@id='gbidiv_brand']/ul/li[@class='kidsRefinement'][10]")
private WebElement searchresultdisplayed;
	
	public Searchresults verifytheresultcheckbox() throws AWTException
	{
		pageScroll();
		verifyDisplayed(searchresultdisplayed);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='shoe-name']/a")
	private WebElement modelname;
	
	public Searchresults verifymodelname() throws AWTException
	{
		pageScroll();
		verifyDisplayed(modelname);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@class='seoTextClass']/div")
	private WebElement keywordsearch;
	
	public Searchresults verifykeyword() throws AWTException
	{
		pageScroll();
		verifyDisplayed(keywordsearch);
		return this;
	}
	
	
	
	public Searchresults nodatasearch()
	{
		getTitle();
		
		return this;
		
		
		
	}
	
	
	@FindBy(how=How.XPATH,using="//div[@id='no_search_results']")
	private WebElement invalidkeyword;
	
	public Searchresults invalidkeyword() throws AWTException
	{
		pageScroll();
		verifyDisplayed(invalidkeyword);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'view-sorts')]")
	private WebElement sortbydropdown;
	
	public Searchresults clickSort(String text) {
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectDropDownUsingText(sortbydropdown,text);
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		highLighterMethod(driver, sortbydropdown);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'results-button next')]")
	private WebElement clickNext;
	
	public Newnext next() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(clickNext);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Newnext();
		
		
		
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@class='advancedSearchTextBox']")
	private WebElement edited;
	
public Searchresults edit(String value) {
	
	type(edited,value);
	clickenter();
	
	return this;
		
		

	}

public Newpageresults editvalid(String value1) {
	
	typeafterclearing(edited,value1);
	clickenter();
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return new Newpageresults();
		
		

	}
	
	@FindBy(how=How.XPATH,using="//select[@name='p']")
	private WebElement showperpage;
	
	public Searchresults showPerpagedropdown() 
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(showperpage);
		
		return this;
	}
	

	
	public Newpageresults verifyshowperpage() throws AWTException
	{
		pageScroll();
click(showperpage);
highLighterMethod(driver, showperpage);
		return new Newpageresults();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'_name_url')]")
	private WebElement productLink;
	
	@FindBy(how=How.XPATH,using="//*[@src='/rrs/img/icons/stars/stars_small-3.0.png']")
	private WebElement reviews;
	
	public Searchresults reviewstars()
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifyDisplayed(reviews);
		return this;
	}
	
	
	public Productdetails clickproductlink()
	{
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = driver;
		js.executeScript("arguments[0].click();", productLink);

		return new Productdetails();
	}
	@FindBy(how=How.XPATH,using="//*[@class='klaviyo_inline_fieldset']/input")
	private WebElement mail;
	
	@FindBy(how=How.XPATH,using="//*[@class='klaviyo_inline_fieldset']/button")
	private WebElement clicksubs;
	
	public Searchresults subscribe(String emailaddress)
	{
		type(mail,emailaddress);
		click(clicksubs);
		return this;
	}
	
	public UserCreatedConfirmation subscribes(String emailaddress)
	{
		type(mail,emailaddress);
		click(clicksubs);
		return new UserCreatedConfirmation();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'searchForm')]")
	private WebElement searchfieldkids;

	public Searchresults entersearchkeykids(String xpath,String data)
	{


		refresh();
		
		smallWait();
		verifyDisplayed(searchfieldkids);
		
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
	@FindBy(how=How.XPATH,using="//*[contains(@class,'shoe-name')]")
	private WebElement secproductLink;
	
	public Productdetails clickproductlinksecondtime()
	{
	try {
		pageScroll();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	


	click(secproductLink);

		return new Productdetails();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'13095_img')]")
	private WebElement secproductLinkkid;
	
	@FindBy(how=How.XPATH,using="//*[@src='/rrs/kids/images/icons/stars/star-rating-sml-4.5.png']")
	private WebElement starrating;
	
	public Productdetails clickproductlinksecondtimekid()
	{
	
	

JavascriptExecutor js = driver;
js.executeScript("arguments[0].click();", secproductLinkkid);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		return new Productdetails();
	}
	
	public Productdetails mousehoverclickproductlinksecondtimekid()
	{
	
	mouseHover(secproductLinkkid);
	highLighterMethod(driver, starrating);
	verifyDisplayed(starrating);

JavascriptExecutor js = driver;
js.executeScript("arguments[0].click();", secproductLinkkid);
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		return new Productdetails();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id='13095_img']")
	private WebElement asicsprod;
	
	public Productdetails clickproductlinkforkids()
	{
		click(asicsprod);
		return new Productdetails();
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='search2']")
	private WebElement searchfieldkid;
	public Searchresults entersearchkid1(String data)
	{


		FluentWait();
		
		verifyDisplayed(searchfieldkid);
		highLighterMethod(driver, searchfieldkid);
		
		type(searchfieldkid, data);
		
		clickenter();
		return new Searchresults();
		
	}
	public Searchresults entersearchkid2(String data)
	{


		FluentWait();
		
		verifyDisplayed(searchfieldkid);
		highLighterMethod(driver, searchfieldkid);
		
		type(searchfieldkid, data);
		
		clickenter();
		return new Searchresults();
		
	}
	public Searchresults entersearchkid3(String data)
	{


		FluentWait();
		
		verifyDisplayed(searchfieldkid);
		highLighterMethod(driver, searchfieldkid);
		
		type(searchfieldkid, data);
		
		clickenter();
		return new Searchresults();
		
	}
	
}