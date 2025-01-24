package AlertsPopupsImplicitFluentWait;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowBasedPopup_WindowHandling 
{
	  public static void main(String[] args) throws InterruptedException
	  {							
	  	  WebDriver driver=new ChromeDriver();			
	        		
	        //Launching the site.				
	        driver.get("https://demo.guru99.com/popup.php");			
	        driver.manage().window().maximize();		
	                		
	        driver.findElement(By.xpath("//a[text()='Click Here']")).click();			
	      	        
	        String MainWindow=driver.getWindowHandle();		
	        System.out.println(MainWindow);    
	        	
	        // To handle all new opened window.				
	            Set<String> s1=driver.getWindowHandles();
	            System.out.println(s1);
	            
	            Iterator<String> i1=s1.iterator();		
			        		
			            while(i1.hasNext())			
	            {		
			            	String ChildWindow=i1.next();		
	            		            	
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                //Switching to Child window
	                 driver.switchTo().window(ChildWindow);	                                                                                                           
	                 driver.findElement(By.name("emailid")).sendKeys("christysharmila9@gmail.com");                			
	                 driver.findElement(By.name("btnLogin")).click();			
	                                 
				     driver.close();	// Closing the Child Window.	
	            }		
	        }		
	        // Switching to Parent window i.e Main Window.
	            driver.switchTo().window(MainWindow);
	            driver.close();	// Closing the Parent Window.
	    }
}
