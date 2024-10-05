package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdemo {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();   //open browser
driver.get("https://www.google.com");   //opening application we want to use,here it is google ..google is
                                        //opening with the help of get method
String actualtitle=driver.getTitle();   //getting title of browser and storing it in a string
String expectedtitle="Google";         //then generating a expected title
                               //then comparing using .equals which used for string comparison becoz memory locating number will be different in string pool constant so == cannot be used
if(actualtitle.equals(expectedtitle)) 
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
driver.close();                          //closing browser
                                         //another one is driver.quit() which is used for quiting browser
                                         //driver.close() is for closing current tab
	}

}
