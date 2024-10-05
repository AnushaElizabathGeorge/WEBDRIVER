package testng;
//passing values in xml for a parameter and calling in class
import org.testng.annotations.Test;

public class Parameters {
	
	@org.testng.annotations.Parameters("v")    //when we run through xml file, here we get value in this class via parameter tag
	@Test
	public void printv(String v)    //print thro method
	{
		System.out.println("v="+v);  //printing
	}

}
// we could store values in xml and call into our class
//always run trou xml