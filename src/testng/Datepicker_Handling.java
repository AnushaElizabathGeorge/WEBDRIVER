package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker_Handling {
	ChromeDriver driver;
	 @BeforeTest
	 public void setUp()
	 {
	  driver=new ChromeDriver();
	  driver.get("https://www.trivago.com/");
	 }
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]/span/span[2]/span[2]")).click();
		//xpath
		datePicker("November 2024","24");
		//making method of month and date we want and is passed
	}
	private void datePicker(String expmonth, String expdate) {
		while(true)
		  {
		   WebElement monthdetails=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
		   String month=monthdetails.getText();
		   if(expmonth.equals(month))
		   {
		    System.out.println(month);
		    break;
		   }
		   else
		   {
		    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
		   }
		
		}
		//since we don't know conditions we are using while loop to iterate and see every month
		//using that text is got and stored to string which is compared with our exp..and then using if else we are getting and printing it.
		//break is used to break the loop when our exp is met.
		
		List<WebElement>listofdate=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		  for(WebElement list:listofdate)
		  {
		   String date=list.getText();
		   if(date.equals(expdate))
		   {
		    list.click();
		    System.out.println(date);
		    break;
			}
		}
		//we are using list to store all dates so that if we need to change a date we doesn't  have to update xpath
		
		
	}
	
}
//if edit text field is available then we can pass directly using sendkeys
//if we needs to pick it then we can use this method
