package testng;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_cw {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver ();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test()
	{
		WebElement phone=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		phone.sendKeys("mobilephones",Keys.ENTER);
		String actualtitle=driver.getTitle();
		String expectedtitle="Amazon.in:mobilephones";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Set<String>  allwindows=driver.getWindowHandles();
		for(String handles:allwindows) {
			
		
			if(!handles.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handles);
				JavascriptExecutor jse=(JavascriptExecutor) driver;
				//driver.manage().window().maximize();
				jse.executeScript("window.scrollBy(0,500)");
				driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
			
				driver.close();
			}
		
	}
	}
}
