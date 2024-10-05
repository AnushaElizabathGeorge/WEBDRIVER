package junit;
//open site,check title rishiherbal, check links are=100,check text food is present and click health.
import java.util.List; 

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classwork_rishiherbal {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
		}
	
@Test
public void titleComparison()
{
	String s=driver.getTitle();
	String st="rishiherbal";
	if(s.endsWith(st))
	{
		System.out.println("pass");	
	}
	else
	{
		System.out.println("fail");
	}

}
@Test
public void testNumberOfLinks()
{
	List<WebElement> li= driver.findElements(By.tagName("a"));
	int s1=li.size();
	int s2=100;
	if(s1==s2)
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
    
}
@Test
public void textVerf()
{
	String s3=driver.getPageSource();
	String s4="Food";
	if(s3.contains(s4))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
@Test
public void health()
{
	driver.findElement(By.xpath("//div[@class='main-menu desktop-menu']/ul/li[2]/a")).click();
}
}
