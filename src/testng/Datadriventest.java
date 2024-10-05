package testng;
//data driven test-testing while passing multiple value through single script


//testing while passing multiple data after calling from xl sheet
//for handling xl sheet we used apache poi

import java.io.FileInputStream;  



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 

public class Datadriventest {
	ChromeDriver driver;
	@BeforeTest
	public void set()

	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test() throws Exception
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\admin\\Downloads\\Datadriventest.xlsx");
		//to read file in java we use a class called fileinputstream and file details passed as constructor
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		//to get details of all sheet from xl we use xssfworbook class
		//for xl new version=xssfworkbook ..see extension of xl file you r saving-.xlsx
		//for xl old version=hssfworkbook ..                                       .xls 
		XSSFSheet wb1=wb.getSheet("Sheet1");
		//for getting a particular sheet we use getsheet..stored to ref xssfsheet wb1
		int row=wb1.getLastRowNum();
		//for getting row we needed,getlastrownum
		for(int i=1;i<=row;i++)
			//for iteration in rows we use for loop..i=1(if o username and password will also be considered)
		{
			String Username=wb1.getRow(i).getCell(0).getStringCellValue();
			//getrow and getcell for row and cell  and getting data we use method getstringcellvalue
			String Password=wb1.getRow(i).getCell(1).getStringCellValue();
			//then password..with cell(column change)number diff
			System.out.println(Username+"----------"+Password);
			driver.findElement(By.name("email")).sendKeys(Username);
			driver.findElement(By.name("pass")).sendKeys(Password);
			driver.findElement(By.name("login")).click();
			driver.navigate().refresh();                   //for refreshing page
			String expectedurl="https://www.facebook.com/profile";
			String actualurl=driver.getCurrentUrl(); 
			if(expectedurl.equals(actualurl))
			{
				System.out.println("login successful");
			}
			else
			{
				System.out.println("not sucessful");
			}
		}
		
		
	}
}
