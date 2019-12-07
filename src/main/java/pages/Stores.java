package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Stores extends ProjectMethods{
	
	public Stores() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'locator-search-value')]")
	private WebElement zip;
	
	public Stores enterzip(String code)
	{
		type(zip,code);
		clickenter();
		return new Stores();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'store_links')]/a[2]")
	private WebElement clickstore;
	
	public Stores clickastore()
	{
		click(clickstore);
		return new Stores();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'FirstName')]")
	private WebElement name;
	
	public Stores typeName(String code)
	{
		switchToWindow(1);
		type(name,code);
		
		return new Stores();
		
	}
	
	
	}
