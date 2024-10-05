package testng;
//login page validation with single user
import org.openqa.selenium.By; 

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fblogin {
ChromeDriver driver;
@BeforeTest
public void set()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void fb()
{
	driver.findElement(By.name("email")).sendKeys("abs@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("abs");
	driver.findElement(By.name("login")).click();
	String expectedurl="https://www.facebook.com/profile";   //link we get have entering into acc after giving crt login crdentials
	String actualurl=driver.getCurrentUrl();                //link we get after automation login
	                                                        //for that we use method getcurrenturl
	                                                        //validation can be done getpagesource and gettext
	
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
