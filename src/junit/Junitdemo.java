package junit;

import org.junit.After;   
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
ChromeDriver driver;
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@Test
	public void textverification()
	{
		String s=driver.getPageSource();
		String st="images";
		if(s.contains(st))
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("text is not present");
		}
	}
	
	@After
	public void setDown()
	{
		driver.quit();
	}
	
}
