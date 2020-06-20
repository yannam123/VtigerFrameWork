package Com.Vtiger.ObjectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElements {
	@FindBy(name="user_name")
	private WebElement username;
	@FindBy(name="user_password")
	private WebElement password;
	@FindBy(id="submitButton")
	private WebElement   LgnBtn;
	@FindBy(xpath="//div[contains(text(),'You must specify a valid')]")
	private WebElement errormsg;
	
	public WebElement getusername() {
		
		return username;
	}

	public WebElement getpassword() {
	
		return password;
	}

	public WebElement getLgnBtn() {
		
		return LgnBtn;
	}
	public WebElement geterromsg()
	{
		return errormsg;
	}
	public void loginToApp(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		LgnBtn.click();
	}

	


}
