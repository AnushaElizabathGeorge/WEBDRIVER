package testpkg;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public static WebDriver driver;      //static since it is needed in every class
	@BeforeTest                          //then inherits this using extends in both class 
	public void bfrtest()                //then after this we can run it from testpg
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

}
//then if we need to run multiple classess then use xml