package amazonMiniProject22;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchQuit 
{
	String Value1;
	String Value2;
	WebDriver a1;
	@Test
	@Parameters("browser")
	public void launch() throws EncryptedDocumentException, IOException
	{
		/*if(nameofbrowser.equals("chrome"))	
		{
			a1=new ChromeDriver();	
		}
		if(nameofbrowser.equals("firefox"))	
		{
			a1=new FirefoxDriver();	
		}*/
	/*	a1.get("https://www.google.com");
	//	driver.manage().window().maximize();
		a1.findElement(By.name("q")).sendKeys("India");
		a1.findElement(By.name("q")).sendKeys(Keys.ENTER);*/
		 FileInputStream  f1 = new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\Murali\\ExcelSheet\\Eeshan.xlsx");
		 Workbook w1= WorkbookFactory.create(f1);
			Sheet  s1= w1.getSheet("Amazon");
			Row r1=	s1.getRow(0);
			 Cell c1=   r1.getCell(2);
			 Value1 = c1.getStringCellValue();
			 Value2 = s1.getRow(1).getCell(2).getStringCellValue();
  	    a1 = new ChromeDriver();
	}
}