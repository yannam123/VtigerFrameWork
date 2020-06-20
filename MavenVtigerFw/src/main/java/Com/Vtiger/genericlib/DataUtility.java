package Com.Vtiger.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	public String getDataFromProperties(String key) throws IOException
	{
		String Propertiefilepath="C:\\DataStorage\\commondata.properties";
		FileInputStream fis=new FileInputStream(Propertiefilepath);
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		
	}
	public String getDataFromExcel(String sheetname , int rownum ,int cellnum) throws EncryptedDocumentException, IOException
	{
		String excelfilepath = "C:\\DataStorage\\Campaign.xlsx";
		FileInputStream fis1 = new FileInputStream(excelfilepath);
		Workbook book=WorkbookFactory.create(fis1);
		Sheet sh = book.getSheet(sheetname);
		String value = sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		return value;
		
	}
	public String getDataFromProperties1(String key) {
		// TODO Auto-generated method stub
		return null;
	}



}
