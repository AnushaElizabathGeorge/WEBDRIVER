package testpkg;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbloginpage;


public class Fbloginpgtest {
	WebDriver driver;
@BeforeTest
public void bftst()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
}
@Test
public void test()
{
	Fbloginpage fb=new Fbloginpage(driver);  //object created and driver details passed in constructor..so when this line is created call goes to to fbloginpage constructor
	                                          //then we'll get values in driver in method Fbloginpage and it will stored there..after that in driver.findelement we'll get browser details
	                                           //so test and page is connected through constructor
	fb.setValues("abc@gmail.com","112");        //method called values passed
	fb.loginclick();
}
}
