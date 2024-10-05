package junit;
//alert ex,hanging alert 
import org.junit.Before; 
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/admin/Downloads/alert_example.html");
}
@Test
public void alert()
{
	driver.findElement(By.xpath("//input[@value='Display alert box']")).click();
	Alert a= driver.switchTo().alert(); //switch to alert from driver which is stored into a interface alert 
	String alerttext=a.getText();     //getting text of alert
	System.out.println(alerttext);    //printing text
	a.accept();  //for accepting(yes)
	//a.dismiss(); for cancelling(no)
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("anu");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("george");
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
}
}
