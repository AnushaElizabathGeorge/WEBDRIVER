package testng;
//take rediff,check whether logo is displayed,radio button is selected,create account button enabled
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff {
ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.rediff.com");
}
@Test
public void createacc()
{
	driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']")).click();

}
@Test
public void rediff()
{
	WebElement lg=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
	boolean b=lg.isDisplayed();
	if(b)
	{
	System.out.println("logo displayed");
	}
	else
	{
		System.out.println("not displayed");
	}
		
}

@Test
public void rb()
{
	WebElement rb=driver.findElement(By.xpath("//input[@checked='checked']"));
	boolean b1=rb.isSelected();
	if(b1)
	{
	System.out.println("radio button selected");
	}
	else
	{
		System.out.println("not selected");
	}
	
}
@Test
public void rb1()
{
	WebElement rb2=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
	boolean b2=rb2.isEnabled();
	if(b2)
	{
		System.out.println("create account button enabled");
		
	}
	else
	{
		System.out.println("not enabled");
	}
	
}
}
