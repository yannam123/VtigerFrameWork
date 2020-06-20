package Com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatePriceBookElements {
	@FindBy(name="bookname")
	private WebElement PriceBookName;
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement SaveBtn;
	public WebElement getPriceBookName()
	{
		return PriceBookName;
		
	}
	public WebElement getSaveBtn()
	{
		return SaveBtn;
		
	}

}
