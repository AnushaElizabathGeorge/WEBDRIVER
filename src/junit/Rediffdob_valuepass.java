package junit;
//take account creation in rediff and pass dob in it
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdob_valuepass {
	ChromeDriver driver;
	@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.rediff.com");
}
	@Test
	public void rediff()
	{
		driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']")).click();
		
		WebElement wb=driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]")); //since dynamic, xpath using contains() is used
		//in selenium if tag is select,select class can be used to handle
		Select dropdown=new Select(wb);  //to call method, object is created of that class
		                                 //constructor through value is passes
		dropdown.selectByVisibleText("08"); //values passed  
		//dropdown.selectByIndex(9); 
		
		WebElement wb1=driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		Select dropdown1=new Select(wb1);
		dropdown1.selectByVisibleText("FEB");
		//dropdown1.selectByIndex(3);
		
		WebElement wb2=driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
		Select dropdown2=new Select(wb2);
		dropdown2.selectByVisibleText("2001");
		//dropdown2.selectByIndex(23);
		
		//to select values ,developers have created different methods in select class
		//select by value,select by visible text,select by index
		
		
	}
	

}
//select[@name='DOB_Daydffc02dd']
//select[@name='DOB_Monthdffc02dd']
//select[@name='DOB_Yeardffc02dd']