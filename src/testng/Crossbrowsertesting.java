package testng;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Crossbrowsertesting {
WebDriver driver;                  //WebDriver interface have methods which we need which have been declared in chromedriver class,edgedriver class and firefoxdriver class.
                                   //so instead of implementing each of them, it have been implemented to remotewebdriver class which have been inherited to others 
                                   //remotewebdriver is implemented to interface webdriver
                                   //so if we declare reference of of interface webdriver we can create object of all 3 with same reference
@org.testng.annotations.Parameters("browser")   //  which browser we are using, we'll take details of it from xml
                                                // using annotation parameter we'll take vale from xml
@BeforeTest
public void setUp(String browser)
{
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
}
@Test
public void test()
{
	driver.get("https://www.google.com");
}
}
