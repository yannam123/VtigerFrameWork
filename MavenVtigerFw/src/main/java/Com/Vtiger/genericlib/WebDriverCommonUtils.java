package Com.Vtiger.genericlib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebDriverCommonUtils {
	public void waitforElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(BaseClass.driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
		public void SelectItemfromlist(WebElement element,String ItemTobeSelect)
		{
		   Select s=new Select(element);
		   s.selectByVisibleText(ItemTobeSelect);
			
		}
		public boolean CheckMultipleList(WebElement element)
		{
			Select s=new Select(element);
			return s.isMultiple();
		}
		public void KeepMouseOnElement(WebElement element)
		{
			Actions act=new Actions(BaseClass.driver);
			act.moveToElement(element).perform();
			
		}
		public void MoveObjectRequiredplace(WebElement source,WebElement target)
		{
			Actions act=new Actions(BaseClass.driver);
			act.dragAndDrop(source, target).perform();
		}
		public void acceptAlert()
		{
			Alert alt=BaseClass.driver.switchTo().alert();
			alt.accept();
		}
		public void ValidationAlertMessage(String expectedAlertText)
		{
			Alert act=BaseClass.driver.switchTo().alert();
			String actualAlertText= act.getText();
			Assert .assertEquals(actualAlertText,expectedAlertText);
			System.out.println("Alert Validation pass");
			
		}
		public void rejectAlert()
		{
		   Alert  alt=BaseClass.driver.switchTo().alert();
		   alt.dismiss();
		}
		public void SwitchToNewWindow()
		{
			String mainId=BaseClass.driver.getWindowHandle();
			Set<String>allId=BaseClass.driver.getWindowHandles();
			for(String id:allId)
			{
				if(!id.equals(mainId))
				{
					BaseClass.driver.switchTo().window(id);
				}
			}
		}
		public void SwitchToMainWindow()
		{
			String mainId=BaseClass.driver.getWindowHandle();
			BaseClass.driver.switchTo().window(mainId);
		}
		public void SwitchToRequiredFrame(WebElement element)
		{
			BaseClass.driver.switchTo().frame(element);
		}
		public void SwitchToDefaultScreen()
		{
			BaseClass.driver.switchTo().defaultContent();
		}
		public void FileUploadToApplication(String filepath) throws AWTException
		{
			filepath=filepath.replace("\\", "\\\\");
			StringSelection path=new StringSelection(filepath);
			Toolkit tool=Toolkit.getDefaultToolkit();
			Clipboard clip =tool.getSystemClipboard();
			clip.setContents(path, null);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		}


}
