package testng;
//copy,paste
//write something in fullname field in rediffmail,copy it and paste in rediffmail id below it.
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypasterediff {
String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver ();
	driver.get(baseurl);
}
@Test
public void rediff()
{
	WebElement fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	WebElement rediff=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
	fullname.sendKeys("abc");          //PASSING VALUE
	Actions act=new Actions(driver);   //TO HANLDE MOUSE AND KEYBOARDS EVENTS WE USE ACTIONS CLASS SO WE ARE CREATING OBJECT OF ACTIONS CLASS
	//CONSTRUCTOR THROUGH  VALUE IS PASSED
	
	//ALL METHODS TO HANDLE THESE ARE ALREADY DEFINED IN CLASS..WE NEED TO CALL THEM
	act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);  //CNTRL A FOR SELECTION
	//KEYS CLASS HAVE CNTRL
	act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);  //CNTRL C FOR COPY
	act.keyDown(rediff,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);   //CNTL V FOR PASTE
	
	act.perform(); //WHENEVER WE DO SOMETHING WITH ACTIONS CLASS WE NEED TO USE PERFORM METHOD TO EXECUTE IT
	//ACTIONS CLASS MAINLY WORK FOR WEB BASED(SITES) THINGS
}
}
