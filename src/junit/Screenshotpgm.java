package junit;
//taking screenshot of page and a element
import java.io.File; 


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/alert_example.html");
	}
	@Test
	public void ss() throws Exception
	{
		//taking ss of a page
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//details in driver added to take screenshot interface and that getScreenshotas(...)method in that takesscreenshot  used to get it and storing o/p
		FileHandler.copy(src, new File("D://alertss.png"));
		//storing to system drive or working directory..here  storing in s/m drive for that here we use file handler class to copy
		//copying from src to new file and adding location to were it should be saved(name and extension can be given along with it)
		
		//taking ss of a particular  element
		WebElement sr1=driver.findElement(By.xpath("//input[@value='Display alert box']"));
		//locating element and store to a element
		File src1=sr1.getScreenshotAs(OutputType.FILE);
		//taking ss of element and storing to file
		FileHandler.copy(src1, new File("./Screenshot/Alertdisplaybutton.png"));
		//copying to working directory
		// ./-path to working directory(folder name ,file name,extension can be added along with it)
	}
}
