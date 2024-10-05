package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99fileupload {
	String baseurl="https://demo.guru99.com/test/upload/";
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver ();
		driver.get(baseurl);
	}
	@Test
	public void test()
	{
		WebElement upload=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	    WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"terms\"]"));
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
		upload.sendKeys("D://photo_2024-06-28_22-30-17.jpg");  //IF EDIT TEXT FIELD IS PRESENT,WE CAN PASS DIRECTLY WITH SENDKEYS
		checkbox.click();
		submit.click();
	}
}
