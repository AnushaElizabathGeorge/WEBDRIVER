package testng;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertion_soft {
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
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		System.out.println("verified");
	}
}
//even if the condition is not met..i.e.test fails..we'll get verified..this is soft assertion
//usually done using if else itself
//otherwise SoftAssert soft=new SoftAssert();
//String actual=driver.findElement(By.id("elementid")).getText()
//Soft.assertEquals( actualtitle, "expectedtitle","title verified");
//Soft.assertAll();