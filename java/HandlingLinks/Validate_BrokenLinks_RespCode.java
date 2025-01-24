package HandlingLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.UnknownHostException;

public class Validate_BrokenLinks_RespCode 
{
	public static void main(String[] args) throws IOException 
	{
		try
		{
			URL url = new URL("http://demo.tanmaysarkar.com/sample_03.html");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			int code = con.getResponseCode(); //if code is 200, then link is not broken
			System.out.println(code);
			String msg = con.getResponseMessage(); //if msg is Ok, then link is not broken
			System.out.println(msg);
		}
		catch(UnknownHostException u)
		{
			u.getMessage();
		}
	}

}
