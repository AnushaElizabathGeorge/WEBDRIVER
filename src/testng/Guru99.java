package testng;
//actions class  

//take site https://demo.guru99.com/test/simple_context_menu.html  ,right clivk 'right click me option  take edit and handle alert(ok)
//then double click 'double click me' then handle alert and print text, then ok
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99 {
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver ();
		driver.get(baseurl);
	}
	
@Test
public void guru()
{
	WebElement rightclickme=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
	WebElement doubleclickme=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	
	Actions act=new Actions(driver);
	act.contextClick(rightclickme);   //context click for right click
	act.perform();
	edit.click();
	

	Alert a=driver.switchTo().alert();
	a.accept();
	
	
	act.doubleClick(doubleclickme);     //double click for double clicking
	act.perform();
	Alert at=driver.switchTo().alert();
	String alerttext=at.getText();
	System.out.println(alerttext);
	at.accept();
	
	
	
	
}
}
