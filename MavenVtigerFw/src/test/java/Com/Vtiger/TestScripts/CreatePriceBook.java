package Com.Vtiger.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import Com.Vtiger.ObjectRepositary.CreatePriceBookElements;
import Com.Vtiger.ObjectRepositary.HomePageElements;

import Com.Vtiger.ObjectRepositary.PriceBookElements;
import Com.Vtiger.ObjectRepositary.PriceBookInfoPageElements;
import Com.Vtiger.genericlib.BaseClass;

public class CreatePriceBook  extends BaseClass{
	@Test
	public   void  CreatePriceBook1() throws EncryptedDocumentException, IOException
	{
		HomePageElements hp=PageFactory.initElements(driver,HomePageElements.class );
		PriceBookElements pb=PageFactory.initElements(driver, PriceBookElements.class);
		CreatePriceBookElements clp=PageFactory.initElements(driver,CreatePriceBookElements.class);
		PriceBookInfoPageElements lip=PageFactory.initElements(driver, PriceBookInfoPageElements.class);
		hp.getPriceBook().click();
		pb.getCreatePriceBook().click();
		clp.getPriceBookName().sendKeys(data.getDataFromExcel("PriceBook", 2, 1));
		clp.getSaveBtn().click();
		String actLeadMsg=lip.getSucessMSg().getText();
		Assert.assertTrue(actLeadMsg.contains(data.getDataFromExcel("PriceBook", 2, 2)));
		
		
}
}
