package Com.Vtiger.TestScripts;
import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Vtiger.ObjectRepositary.CreateLeadPageElements;
import Com.Vtiger.ObjectRepositary.HomePageElements;
import Com.Vtiger.ObjectRepositary.LeadInfoPageElements;
import Com.Vtiger.ObjectRepositary.LeadPageElements;
import Com.Vtiger.genericlib.BaseClass;


public class CreatLeadTest1 extends BaseClass {
	@Test
	public void CreateLead1() throws IOException {
		HomePageElements hp=PageFactory.initElements(driver,HomePageElements.class );
		LeadPageElements lp=PageFactory.initElements(driver, LeadPageElements.class);
		CreateLeadPageElements clp=PageFactory.initElements(driver,CreateLeadPageElements.class);
		LeadInfoPageElements lip=PageFactory.initElements(driver, LeadInfoPageElements.class);
		hp.getLead().click();
		lp.getCreatelead().click();
		clp.getLastName().sendKeys(data.getDataFromExcel("LeadData", 2 , 1));
		clp.getCompanyNametb().sendKeys(data.getDataFromExcel("LeadData", 2, 2));
		clp.getSaveBtn().click();
		String actLeadMsg=lip.getSucessMsg().getText();
		Assert.assertTrue(actLeadMsg.contains(data.getDataFromExcel("LeadData", 2, 3)) );
		

}
}

