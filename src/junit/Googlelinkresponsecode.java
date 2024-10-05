package junit;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelinkresponsecode {
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
		List<WebElement> li= driver.findElements(By.tagName("a"));
		System.out.println("no.of links="+li.size());
		for(WebElement linkname:li)  
		{
			String link=linkname.getAttribute("href");
			verifylink(link);     //method creating 'verifylink' and link is passed as parameter
			//since there is more than 1 link,method is created so in each iteration, a call is going to that method
		}
	}
	private void verifylink(String link) {
		//since we are doing multiple links and execution should not stop by error in one,we use try catch
		try
		{
			URI ob=new URI(link);
			HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
			if(con.getResponseCode()==200)
			{
				System.out.println("successful response code is 200------"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("broken link response code is 404------"+link);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
