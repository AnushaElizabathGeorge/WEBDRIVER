package junit;
//take google website and search wipes
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void fbsearch()
	{
		WebElement searchfield=driver.findElement(By.name("q")); //.sendKeys("aa")
		searchfield.sendKeys("wipes",Keys.ENTER);
		
	//driver.findElement(By.name("q")).click();   ...this cannot be used since search result is not showing
    //becoz the suggestion box overlay google search button so keys.enter can be used or else 
	//searchfiled.submit() can be used
	
	}

}
