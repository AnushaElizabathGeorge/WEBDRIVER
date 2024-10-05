package junit;
//count no of links in google.com an print it along with text
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void linkCount()
	{
		List<WebElement> li= driver.findElements(By.tagName("a"));  //inspect link , a tagname will be present.confirm it by checking others
		System.out.println("no.of links="+li.size());
		
		for(WebElement linkname:li)     //for fetching values from list we use for each 
		{
		   String link=linkname.getAttribute("href"); //need attribute href of element linkname
		                                              //getAttribute is used to print details of element
		   String linktext=linkname.getText();  //to get text of element
		                                        //getText is used to get text details of element
		   System.out.println(link+"---------------------"+linktext);
		}
	}
    
	
	
	

		
		
	
}
