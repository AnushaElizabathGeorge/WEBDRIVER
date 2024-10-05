package testng;

import java.io.File;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Janasya {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver ();
		driver.get("https://janasya.com/");
	}
	@Test
	public void test()
	{
		String title=driver.getTitle();
		String exp="Janasya";
		if(title.equalsIgnoreCase(exp))
		{
			System.out.println("Title crt");
		}
		else
		{
			System.out.println("Title incrt");
		}
	}
	@Test
	public void linkverify()
	{
		List<WebElement> li=driver.findElements(By.tagName("img"));
		int l1=li.size();
		int l2=400;
		if(l1==l2)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void ss() throws Exception
	{
		File sr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sr, new File("D://janasyass.png"));
	}
}

