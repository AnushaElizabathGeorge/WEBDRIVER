package junit;
//open fb.com and print no of response codes
import java.io.IOException; 
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class Responsecode {
	
String link="https://www.facebook.com";     //since browser is not opening we are not using @before

@Test
public void responseCode() throws URISyntaxException, MalformedURLException, IOException
{
	URI ob=new URI(link);
	
HttpURLConnection c=(HttpURLConnection)ob.toURL().openConnection(); //network connection is needed to open link
//to enable connection,for getting connection we want the link for which response code is needed into URI class
//so object needs to be created of that class and link is passed through constructor
//uri-uniform resource identifier
//changing to url(toURL) and giving openConnection
//finding response code,finding response msg(all methods based on http) all these methods are in stored class HttpURLConnection
//HttpURLConnection is a subclass of url connection
//in ob.toURL().openConnection(); we get url connection we should be changed to HttpURLConnection
//for that we do cast into HttpURLConnection
//cast - float f=5.6f;
//       double d=(double)f
// (HttpURLConnection)ob.toURL().openConnection();
//then storing to HttpURLConnection with a referencename c

	System.out.println(c.getResponseCode());
	
}
}
