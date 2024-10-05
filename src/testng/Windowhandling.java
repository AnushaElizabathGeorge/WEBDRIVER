package testng;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandling {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver ();
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test()
	{
		String parentwindow=driver.getWindowHandle();        //getting details of 1st tab and storing               
		System.out.println("parentwindow="+driver.getTitle());   //if need title print
		driver.findElement(By.xpath("/html/body/p/a")).click();  
		Set<String>  allwindows=driver.getWindowHandles();  //getting details of 2 tabs and stored in set, which is got as id so string
		for(String handles:allwindows) {                   //for each loop used to take values one by one
			
		
			if(!handles.equalsIgnoreCase(parentwindow))  //if not equal with parentwindow we should switch so !(not)
			{
				driver.switchTo().window(handles);  //not eq switching to next
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("avc@gmail.com"); //then values passed
				driver.close();               //window close
			}
			driver.switchTo().window(parentwindow);  //if need can switch back to parent
		}
	}
}
//multiple tabs and windows are handled using getwindowhandle and getwindowhandles
//getwindowhandle-to get details of current tab
//getwindowhandles-to get details of mult tab or wind..which is stored in set
//list and set both for storing mul values..in list duplicate entries possible but not in set
//list is ordered but set is unordered