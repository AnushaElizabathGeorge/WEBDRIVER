package pagepkg;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
WebDriver driver;       //instance variable
@FindBy(id="email")            //elements are located in starting itself..this is called object repository
WebElement fbemail;            //using page factory
@FindBy(id="pass")             //annotaion @findby used to find element..
WebElement fbpswd;             //then storing to a webelement
@FindBy(name="login")
WebElement fbloginbutton;

//By fbemail=By.id("email");     //elements located in starting itself and stored in a reference and this process is called  object repository
//By fbpwsd=By.id("pass");       
//By fbloginbutton=By.name("login");



public  Fbloginpage(WebDriver driver)      //when giving driver.findelement it only gives nullpoint exception
                                           //to get browser details in test page we use constructor here. line 10 is instance variable..to get brower details there, for initializing it  we use constructor
{                                          //constructor name will be classname itself and no returntype not even void..when object of this class or page, driver details passed,constructor is invoked when object is created 
	this.driver=driver;                    //which will get value here which points to 10 and will pass values to driver(10)
	
	PageFactory.initElements(driver, this); //to initializing all elements..pagefactory is a class in selenium..initializing driver..then using this point out this class..to avoid driver.findelement in each case
	                                        //pagefactory is used to avoid repetitions of code
}

public void setValues(String email, String pass)     //values set 
{
	fbemail.sendKeys(email);
	fbpswd.sendKeys(pass);
	//driver.findElement(fbemail).sendKeys(email);    
	//driver.findElement(fbpwsd).sendKeys(pass);
}

public void loginclick()                  //click  in a different method
{
	fbloginbutton.click();
	//driver.findElement(fbloginbutton).click();
}

}
