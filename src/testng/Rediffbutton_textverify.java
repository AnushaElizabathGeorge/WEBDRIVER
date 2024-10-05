package testng;


import org.openqa.selenium.By; 

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffbutton_textverify {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		
		WebElement text=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));  //inspect and see if it as text or attribute
		if(text.getAttribute("value").equals("Check availability"))
		{
			System.out.println("text present");
		}
		else
		{
			System.out.println("not present");
		}
	}

}
