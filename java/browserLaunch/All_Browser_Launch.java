package browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_Browser_Launch 
{
	public static void main(String args[]) throws InterruptedException
	{
	//WebDriver is an Interface
	//driver - Object
	//ChromeDriver,FirefoxDriver,EdgeDriver - Class -> All these drivers are implementing WebDriver Interface
	// for using all the methods of WebDriver Interface
				
//		WebDriver driver1 = new FirefoxDriver();
//		WebDriver driver2 = new EdgeDriver();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("Get Commands in Selenium");
		System.out.println(" ");
		
		driver.get("https://demo.guru99.com/test/newtours//"); //to launch application
		System.out.println(driver.getCurrentUrl());//To print the url of an application
		System.out.println(driver.getTitle());
		
		System.out.println(" ");
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		System.out.println(driver.getCurrentUrl());
				
		//How do you verify title of a webpage
		
		String title = driver.getTitle();
		System.out.println(title);
		
			if(title.equals("Register: Mercury Tours"))
				{
					System.out.println("I am on Register Page of NewTours Application");
				}
			else
				{
					System.out.println("I landed wrongly");
				}
		
		//System.out.println(driver.getPageSource()); //To print page source of an application
		
		//driver.getWindowHandle(); //used to handle single parent - child window
		// return type for windowhandle - String
		//driver.getWindowHandles(); // used to handle Multiple window
		// return type for windowhandles - set<string>
		
		driver.close(); //closes the current window
		driver.quit(); //closes all the opened window 
		
		
	}	
}
