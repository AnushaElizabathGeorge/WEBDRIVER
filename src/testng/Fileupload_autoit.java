package testng;

import org.openqa.selenium.By; 

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload_autoit {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver ();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\admin\\Documents\\File upload.exe");//running exe file while passing path of execution file
		Thread.sleep(3000);
		
	}
}
//cdrive-program file86-autoit3-
//script write in scite folder-scite application--there we will write script, were we will add path of file,open
//ControlFocus("Open","","Edit1")...when we click button to upload, window will open,in filename were we need to set path details..so we should know filename details
//filename properties is passed in()..to know it au3info in autoit3..drag findertool and drop in filename to know its properties...("title","","controlID")..controlid-classinstance

//ControlSetText("Open","","Edit1",path)..after focusing field now passing path along with field properties.

//sleep()//giving it for wait..which is optional

//ControlClick("Open","","Button1")..opening path by clicking button

//after writing script save it..then compile to .exe so that it will convert from au3 to .exe..take file ..right click..compile script86
//after every modification save and compile it.
//pass .exe file using eclipse to run,,which is shown above
//autoit only support in windows doesn't support in mac
