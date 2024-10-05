package testng;

import java.util.ArrayList;


import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandling_multiple {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver ();
		driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
		driver.switchTo().newWindow(WindowType.TAB);        //switch to new window 
		driver.get("https://www.facebook.com");             //then site
		driver.switchTo().newWindow(WindowType.TAB);       //switch
		driver.get("https://www.ebay.com");                //site
		ArrayList<String> windows=new ArrayList<>(driver.getWindowHandles());   //details of tabs stored to list..since list is ordered and we can get using index value which is there in arraylist.
		                                   // so casting to array list
		driver.switchTo().window(windows.get(1)); //calling details using index of window
		System.out.println(driver.getTitle());
	}
}
//using this we could handle multiple tabs