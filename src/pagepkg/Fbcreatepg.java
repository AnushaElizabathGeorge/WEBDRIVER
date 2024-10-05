package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testpkg.Baseclass;

public class Fbcreatepg extends Baseclass {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	WebElement fbclass;
	
	@FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
	WebElement signup;
	public  Fbcreatepg(WebDriver driver)

	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createapageclick()
	{
		fbclass.click();
	}
	
	public void textVerify()
	{
		  String act= driver.getPageSource();
		  if(act.contains("Create a page"))
				  {
					 System.out.println("pass"); 
				  }
		  else
		  {
			  System.out.println("fail");
		  }
		  		
		  
		 
	}
	public void  signupclick()
	{
		signup.click();
	}

}
