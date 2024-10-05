package testng;
//drag and drop

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99draganddrop {
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
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
		WebElement debitacc=driver.findElement(By.xpath("//*[@id=\"shoppingCart1\"]/h3"));
		WebElement debitamnt=driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/h3"));
		WebElement creditacc=driver.findElement(By.xpath("//*[@id=\"shoppingCart3\"]/h3"));
		WebElement creditamnt=driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/h3"));
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement debit5k=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement credit5k=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		
		Actions act=new Actions(driver);    //ACTIONS CLASS OBJECT CREATED
		act.dragAndDrop(debitacc, bank);  //KEYBOARD EVENT -DRAG AND DROP. AND A METHOD DRAG AND DROP IS PRESENT IN ACTIONS CALSS
		act.dragAndDrop(debitamnt, debit5k);
		act.dragAndDrop(creditacc, sales);
		act.dragAndDrop(creditamnt, credit5k);
		act.perform();
		WebElement display=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		boolean b=display.isDisplayed();
		if(b)
		{
			System.out.println("displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
	}
}
