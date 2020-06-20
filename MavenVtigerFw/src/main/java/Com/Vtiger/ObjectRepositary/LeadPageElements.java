package Com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadPageElements {
	@FindBy(css="img[title='Create Lead...']")
	private WebElement CreateLead;
	public WebElement getCreatelead()
	{
		return CreateLead;
		
	}
	
	

}
