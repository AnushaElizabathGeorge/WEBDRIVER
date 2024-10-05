package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Testngdemo {
@BeforeTest                 
public void testUp() {
	System.out.println("before test");
}
@BeforeMethod
public void bfrmthd()
{
	System.out.println("before method");
}
@Test(priority = 5,groups= {"smoke"})
public void test1()
{
	System.out.println("test1");
}
@Test(priority = 4,invocationCount=3,groups= {"smoke","sanity"})
public void test2()
{
	System.out.println("test2");
}
@Test(priority = 1,dependsOnMethods= {"test1"},groups= {"sanity"})
public void test3()
{
	System.out.println("test3");
}
@Test(priority = 2,groups= {"regression"})
public void test4()
{
	System.out.println("test4");
}
@Test(priority = 3,groups= {"regression"})                            //enabled=false
public void test5()
{
	System.out.println("test5");
}
@AfterMethod
public void aftrmthd()
{
	System.out.println("after method");
}
@AfterTest
public void testDown()
{
	System.out.println("after test");
}

}
// to run the group we want ,we do it with xml file which helps to pass intructions in running
//using group tag we tells that we are doing group
//then mentioning what should be done in group-run tag
//then mentioning what should be included in it-include tag