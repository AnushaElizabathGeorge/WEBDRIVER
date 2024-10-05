package testng;
//passing values for fb login and calling in class
import org.openqa.selenium.By; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook1 {
	ChromeDriver driver;
@BeforeTest
public void setFb()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
}
@org.testng.annotations.Parameters({"email","pass"})
@Test
public void fb(String email,String pass)
{
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("pass")).sendKeys(pass);
	driver.findElement(By.name("login")).click();
}
}
