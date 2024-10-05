package testpkg;


import org.testng.annotations.Test; 

import pagepkg.Fbcreatepg;

public class Fbcreatepgtest extends Baseclass {
/*WebDriver driver;                    //if there is anything common in both class that can be added to a separate class
@BeforeTest
public void bfrtest()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
} */
@Test
public void test()
{
	Fbcreatepg ob=new Fbcreatepg(driver);
	ob.createapageclick();
	ob.textVerify();
	ob.signupclick();
}
}
