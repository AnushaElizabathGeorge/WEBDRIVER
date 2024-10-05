package junit;
//open amazon and click certain tabs using xpath
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_relativepath {
	ChromeDriver driver;
	@Before

	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void amazon()
	{
		WebElement searchfield=driver.findElement(By.name("field-keywords"));
		searchfield.sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class=' nav-progressive-attribute']")).click();
		driver.findElement(By.xpath("//div[@id='nav-xshop-container']/div[1]/a[5]")).click();
		driver.findElement(By.xpath("//div[@id='cart-count-container']")).click();
		driver.findElement(By.xpath("//div[@class='nav-line1-container']/span[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-main']/div/a")).click();
	}	
}
