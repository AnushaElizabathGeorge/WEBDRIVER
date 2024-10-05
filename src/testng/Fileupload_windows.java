package testng;


import java.awt.Robot;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload_windows {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver ();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	@Test
	public void test() throws Exception
	{
		  
		fileUpload("D:\\photo_2024-06-28_22-30-17.jpg");   //MEHTOD CREATED AND PARAMETER WHICH IS THE PATH OF FILE I WANT TO UPLOAD IS PASSED
	}
	private void fileUpload(String o) throws Exception {
		
		//SETTING PATH TO S/M CLIPBOARD
		StringSelection sr=new StringSelection(o); //USING CLASS STRINGSELECTION WE ARE SELECTING COMPLTE PATH AND CONSTRUCTOR THROUGH PATH IS PASSED IN OBJECT
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sr, null);  //ACCESSING CLIPBOARD TO SET PATH IN CLIPBOARD
		//NULL-EARLIER OWNERS PERMISSION WAS NEEDED TO SET VALUES IN CLIPBOARD WHICH IS NOT NEEDED NOW,SO NULL.
	    //CLIPBOARD IS PLACE WERE WE TEMPORARILY STORE COPIED CONTENTS IN A SYSTEM	
	
		//NOW FOR PASTING WE USE ROBOT CLASS SINCE ITS S/M WINDOW SO WE CANNOT DO IT BY SELENIUM BASED ...SO BY USING ROBOT CLASS, EXTERNALLY WE DO IT.
	Robot rb=new Robot();
	rb.delay(300); //SINCE S/M WINDOW WAIT(SELENIUM BASED) WONT WORK. SO WE CAN USE JAVA BASED DELAY.
	//THREAD.SLEEP=EXECUTION STOPS.NOT DYNAMIC.WAIT FULLY(30S).
	
	rb.keyPress(KeyEvent.VK_CONTROL); //KEYPRESS AND KEYRELEASE METHOD USED.IN KEYEVENT CLASS WHERE ALL KEYS ARE DEFINED
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	}
}
