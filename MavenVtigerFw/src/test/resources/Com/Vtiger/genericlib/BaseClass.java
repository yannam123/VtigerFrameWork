package Com.Vtiger.genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Com.Vtiger.ObjectRepositary.HomepageElements;
import Com.Vtiger.ObjectRepositary.LoginPageElements;
import Com.Vtiger.ObjectRepositary.WebDriverCommonUtils;
public class BaseClass {
	
    public static WebDriver driver ;
	public DataUtility data=new DataUtility();
	public WebDriverCommonUtils wlib=new WebDriverCommonUtils();
    @BeforeSuite
	public void ConfigBS()
	{
    	System.out.println("..................Data Base Connect................");
		
	}
    
    
    @BeforeClass
	public void ConfigBC() throws IOException
	{
      
      System.out.println("..................Browser Launching Starts ............");
      String browser = data.getDataFromProperties("browser");
     
      if(browser.equals("chrome")) 
      {  
    	  driver = new ChromeDriver();
      }else if(browser.equals("firefox")) {
    	  driver =new FirefoxDriver();
      }

      driver .manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      driver.get(data.getDataFromProperties("url"));
      System.out.println("..................Broswer Launching Ends .......................");
		
	}
    @BeforeMethod
	
	public void ConfigBM() throws IOException
	{
    	System.out.println("............Login Strats....................");
    	LoginPageElements login=PageFactory.initElements(driver, LoginPageElements.class);
    	login.loginToApp(data.getDataFromProperties("username"),data.getDataFromProperties("password"));
		System.out.println("--------------Login Ends --------------------");
		
	}
	@AfterMethod
	public void ConfigAM()
	{
		System.out.println("----------------Logout Starts ----------------");
		HomepageElements hp=PageFactory.initElements(driver, HomepageElements.class);
		hp.getSignoutDD();
		hp.getSignoutLink();
		
	    System.out.println("----------------Logout Ends-------------------");
		
	}
	@AfterClass
	public void ConfigAC()
	{
		System.out.println("----------------Close Browser -------------");
		driver.quit();
	}
	@AfterSuite
	public void ConfigAS()
	{
		System.out.println("-----------Data Base Disconnect---------");
	}

}
