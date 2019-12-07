package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FitFinder  extends ProjectMethods{
	
	public FitFinder() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Get Started Now')]")
	private WebElement getstarted;
	
	public FitFinder clickGetStarted()
	{
		click(getstarted);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'aboutYou-gender-male')]")
	private WebElement male;
	
	public FitFinder clickmale()
	{
		click(male);
		takeSnap();
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@value,'runningType-running')]")
	private WebElement running;
	
	public FitFinder clickrunning()
	{
		click(running);
		takeSnap();
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'aboutYou-surface-1')]")
	private WebElement pavement;
	
	public FitFinder clickpavement()
	{
		click(pavement);
		takeSnap();
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'aboutYou-mileage-1')]")
	private WebElement mileage;
	
	public FitFinder clickmileage()
	{
		click(mileage);
		takeSnap();
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'btn-next')]")
	private WebElement next;
	
	public FitFinder clicknext()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		click(next);
		takeSnap();
		return this;
	}
	@FindBy(how=How.XPATH,using="//*[contains(@id,'goals-1')]")
	private WebElement healthy;
	
	public FitFinder clickhealthy()
	{
		click(healthy);
		takeSnap();
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'weight-150')]")
	private WebElement under150;
	
	public FitFinder clickunder150()
	{
		click(under150);
		takeSnap();
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'archType-high')]")
	private WebElement higharch;
	
	public FitFinder clickhigharch()
	{
		click(higharch);
		takeSnap();
		return this;
	}
	@FindBy(how=How.XPATH,using="//*[contains(@id,'legPos-out')]")
	private WebElement legpos;
	
	public FitFinder clicklegpos()
	{
		click(legpos);
		takeSnap();
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'back-men-lbl')]")
	private WebElement pain;
	
	public FitFinder clickpain()
	{
		click(pain);
		takeSnap();
		return this;
	}
	@FindBy(how=How.XPATH,using="//*[contains(@id,'cushion-1')]")
	private WebElement level;
	
	public FitFinder clicklevel()
	{
		
	
		click(level);
		
		takeSnap();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'11')]")
	private WebElement size;
	
	
	
	public FitFinder clicksize()
	{
		click(size);
		takeSnap();
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'btn-group_b')]/label")
	private WebElement width;
	
	public FitFinder clickwidth()
	{
		click(width);
		takeSnap();
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@value,'Get it now')]")
	private WebElement getitnow;
	
	public FitFinder clickgetitnow()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifyDisplayed(getitnow);
		
		takeSnap();
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'addToCartButton')]")
	private WebElement addtocart;
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'Black')]")
	private WebElement color;
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'8')]")
private WebElement sizes;

	@FindBy(how=How.XPATH,using="//*[contains(@id,'Width;D')]")
	private WebElement widthd;
	
	public FitFinder clickaddtocart()
	{
		
		click(color);
		click(sizes);
		click(widthd);
		click(addtocart);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}