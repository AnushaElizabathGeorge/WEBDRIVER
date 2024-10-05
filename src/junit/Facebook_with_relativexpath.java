package junit;
//open fb.com,pass elements and login using xpath
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_with_relativexpath {
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
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1222");
	driver.findElement(By.xpath("//button[@name='login']")).click();	
}
}
