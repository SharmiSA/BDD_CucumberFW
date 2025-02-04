package HandlingLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindBrokenLinks
{
	public static void main(String[] args)
	{
		String homePage = "https://demo.guru99.com/test/newtours//";
		
        String url = "";
        
      //we can send HTTP requests and capture HTTP response codes from the response.
        HttpURLConnection huc = null;
        int respCode = 200; //Success
        
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        
        driver.get(homePage);
        
      //  Identify all links in a webpage and store them in List.
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        int Links_count =links.size();
        System.out.println(Links_count);
        
        //Obtain Iterator to traverse through the List.
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext())
        {            
           //we will check if URL belongs to Third party domain or whether URL is empty/null.
        	//Get href of anchor tag and store it in url variable. 
        	url = it.next().getAttribute("href");
            
            System.out.println(url);
        
          //Check if URL is null or Empty and skip the remaining steps if the condition is satisfied.
            
            if(url == null || url.isEmpty())
            {
            	System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            
          //Check whether URL belongs to a main domain or third party. Skip the remaining steps if it belongs to third party domain.
            if(!url.startsWith(homePage))
            {
                System.out.println("URL is redirected");
                continue;
            }
            
            try 
            {
                // Send http request
            	//HttpURLConnection class has methods to send HTTP request and capture HTTP response code. 
            	//So, output of openConnection() method (URLConnection) is type casted to HttpURLConnection.
            	
            	huc = (HttpURLConnection)(new URL(url).openConnection());
                
                //We can set Request type as �HEAD� instead of �GET�. So that only headers are returned and not document body.
            	huc.setRequestMethod("HEAD");
                
               //On invoking connect() method, actual connection to url is established and the request is sent.
            	huc.connect();
                
                //Validating Links
            	//Using getResponseCode() method we can get response code for the request
            	respCode = huc.getResponseCode();
                
               //Based on response code we will try to check link status.
            	
            	if(respCode >= 400)
                {
                    System.out.println(url+" is a broken link");
                }
                else
                {
                    System.out.println(url+" is a valid link");
                }
                    
            } 
            catch (MalformedURLException e) 
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
            catch (IOException e) 
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        driver.quit();

    }
}
/*
  100 Series - Informational response
	200 - Success
	300 - redirection
	400 - client errors
	500 - server errors
	
	Step 1: we can send HTTP requests and capture HTTP response codes from the response - Declare HttpURLConnection class.
	Step 2: Identify all links in a webpage and store them in List.
	Step 3: I will get total size.
	Step 4: Traverse through each and every link.
	Step 5: Get href of anchor tag and store it in url variable. 
	Step 6: Check if URL is null or Empty - Print Not a valid URL (skip the remaining steps if the condition is satisfied).
	Step 7:  Check whether URL belongs to a main domain or third party -  I will print success or redirection message
	Step 8:
	Main steps:
	Step 8.1: Send HTTP requests
	Step 8.2: Calling connect method 
	Step 8.3: Validate response code
	
	
 */


