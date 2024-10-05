package testng;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Countryrediff {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver ();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
@Test
public void test()
{
	
	List<WebElement> li=driver.findElements(By.tagName("select"));
	for(WebElement list:li)
	{
	String country=list.getAttribute("label");
	String cntry=list.getText();
	System.out.println(country+"---------"+cntry);
	}
	

	
	
	
}
}
