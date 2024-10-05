package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Assertion_hard {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Google1";
		Assert.assertEquals( actualtitle, expectedtitle,"title verified");
		System.out.println("verified");
	}
}
//here we use assert class..since we need to compare we use assertEquals..
//if condition fails..it will be terminated from that line and next line will not execute
//we use this in report generation for comparisons