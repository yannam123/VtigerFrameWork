package Com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLeadPageElements {
	@FindBy(name="lastname")
	private WebElement LastNametb;
	@FindBy(name="company")
	private WebElement CompanyNametb;
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement SaveBtn;
	public WebElement getLastName()
	{
		return LastNametb;
		
	}
	public WebElement getCompanyNametb()
	{
		return CompanyNametb;
	}
	public WebElement getSaveBtn()
	{
		return SaveBtn;
		
	}

}

