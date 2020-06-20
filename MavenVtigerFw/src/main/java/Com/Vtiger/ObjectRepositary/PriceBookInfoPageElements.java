package Com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceBookInfoPageElements {
	@FindBy(xpath="//span[contains (text(),'Price Book Information')]")
	private WebElement SucessMsg;
	public WebElement getSucessMSg()
	{
		return SucessMsg;
		
	}

}
