package Com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Com.Vtiger.genericlib.BaseClass;

public class HomePageElements extends BaseClass{
	@FindBy(linkText="Leads")
	private WebElement leads;
	@FindBy(linkText="Campaigns")
	private WebElement Campaign;
	@FindBy(linkText="Price Books")
	private WebElement PriceBook;
	@FindBy(linkText="//span[text()=' Administrator']/../following-sibling::td[1]/img")
	private WebElement SignoutDD;
	@FindBy(linkText="Sign Out")
	private WebElement SignoutLink;
	public WebElement getLead()
	{
		return leads;
		
	}
	public WebElement getCampaign()
	{
		return Campaign;
		
	}
	public WebElement getPriceBook()
	{
		return PriceBook;
		
	}
	public WebElement getSignoutDD()
	{
		return SignoutDD;
		
	}
	public WebElement getSignoutLink()
	{
		return SignoutLink;
		
	}
	public void LogoutFromApp()
	{	
		wlib.KeepMouseOnElement(SignoutDD);
		SignoutLink.click();
    }
	
	
	
	
	


}
