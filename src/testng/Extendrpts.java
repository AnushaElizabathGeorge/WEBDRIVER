package testng;

import java.io.File; 


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class Extendrpts {
WebDriver driver;
String baseurl="https://www.facebook.com";
ExtentSparkReporter reporter;     //we use this class look and feel change of report
ExtentReports extent;             //using this class we add new entries like environment details lik os..
ExtentTest test;                  //using this we an do updations od document
@BeforeTest
public void bftest()
{
	reporter=new ExtentSparkReporter("./Reports/extentrpt.html");      //creating object of extentsparkrepoter and path is passed were report should be created
	reporter.config().setDocumentTitle("Automationtest");  //then giving doctitle,reportname,theme
	reporter.config().setReportName("Regressiontest");
	reporter.config().setTheme(Theme.STANDARD);
	extent=new ExtentReports();                           //then for giving enteries we are suing extentreports so object of that class id created
	extent.attachReporter(reporter);                      //attaching file to add values for that attachreporter method is used
	extent.setSystemInfo("hostinfo", "localhost");        //using systeminfo method all environment details we wanted is given
	extent.setSystemInfo("OS", "windows11");
	extent.setSystemInfo("testername", "anusha");
	extent.setSystemInfo("browsername", "chrome");
	driver=new ChromeDriver();
}
@BeforeMethod
public void bfrmthd()
{
	driver.get(baseurl);
}

@Test
public void test()
{
	test=extent.createTest("Titleverification");        //creating a section to store result of test
	String exp="facebook";                                   
	String act=driver.getTitle();
	Assert.assertEquals(act,exp );
	//we there is more than 1 test and we haven't given any priority then it will go on the basis of alphabetical order
}
@Test
public void test1()
{
	test=extent.createTest("buttonverification");
	String buttontest=driver.findElement(By.xpath("//*[@id=\"u_0_5_yt\"]")).getText();
	Assert.assertEquals(buttontest, "register");
}


@AfterTest
public void aftertest()
{
extent.flush();           //for report generation we use extent.flush which is needed for execution
}

@AfterMethod
public void aftrmthd(ITestResult result) throws Exception      //for getting details of test we use a interface called itestresult which have different methods declared in it like getstatus,getname,gethrowable etc.
{                                                        //itestresult interface is used to get status,name,msg etc of previously executed method
	if(result.getStatus()==ITestResult.FAILURE)      //we'll take status of result and is compared with failure
	{
test.log(Status.FAIL,"test case failed is"+result.getName());    //logging to report of failure and adding name of method for which failure happened    
test.log(Status.FAIL, "test case failed is"+result.getThrowable());

String screenshotpath=screenshotMethod(driver,result.getName()); //taking ss of failure for that creating a method
test.addScreenCaptureFromPath(screenshotpath);   //returning destination of the place we save ss and adding to report
	}
	else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP, "test case skipped is"+result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS, "test case passed is"+result.getName());
	}

}
private String screenshotMethod(WebDriver driver, String screenshotname) throws Exception {
	File sr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String destination="./Screenshot/"+screenshotname+".jpeg";
	FileHandler.copy(sr, new File(destination));
	return destination;
}

 


}
