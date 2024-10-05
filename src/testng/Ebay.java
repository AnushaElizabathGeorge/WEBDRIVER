package testng;
//wait 
//TAKE SITE EBAY,MOUSEOVER ELECTRONICS AND CLICK SMARTPHONE AND ACCESSORIES
import java.time.Duration; 


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	String baseurl="https://www.ebay.com/";
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver ();
		driver.get(baseurl);
	}
	@Test
	public void ebay()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement elec=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		WebElement smart=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(elec); // to mouseover we use moveToElement method from actions class
		act.perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click();
		//smrt.click();
		
		//to load smart and accessories some time is needed,so we apply wait
		//for synchronization we use selenium wait
		//there are mainly 3 waits in selenium-implicit,explicit,fluent
		
		//implicit wait-global wait(only needed to write one time,it will apply for all line of codes under it)
		//all waits are dynamic eg.if we give 30s but it loads in 3 sec then rest 27 sec will be removed
		//for implicit, wait we have its method (implicitlyWait)
		//syntax of implicit- driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
		//disadv=line number more,if 5 line then total 10 lines of execution since implicit wait code works before each line so it affects execution speed
		
		//explicit wait-apply on certain conditions
		//in this we have class webDriverwait for which object should be created first
		//WebDriverwait wait=new WebDriverwait(driver,Duration.ofSeconds(30))...time is passed through constructor
		//then code can be given for whatever condition you want..
		//wait.until(ExpectedConditions.visibilityOfElementlocated(By.xpath(""))
	}
	
}
