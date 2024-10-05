package junit;
//open facebook.com and pass elements, after that click login

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
ChromeDriver driver;
	@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
	@Test
	public void fbloc()
	{
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	//to find an element findElement is used which helps to find one element details
	//so all these locators like id,name,xpath etc all are defined in 'by' class hence calling by classname 'By'.
	//sendkeys method used to pass values through webdriver in a editable field
		driver.findElement(By.id("pass")).sendKeys("1233");
		driver.findElement(By.name("login")).click();
	}
	
	
}
