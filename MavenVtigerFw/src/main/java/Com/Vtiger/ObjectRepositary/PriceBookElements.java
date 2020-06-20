package Com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceBookElements {
	@FindBy(xpath="//img[@alt='Create Price Book...']")
	private WebElement CreatePriceBook;
	public WebElement getCreatePriceBook()
	{
		return CreatePriceBook;
		
	}

}
