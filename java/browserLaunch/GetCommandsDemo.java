package browserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommandsDemo 
{

	public static void main(String[] args) 
	{
		//WebDriver driver1 = new FirefoxDriver();
		
		//WebDriver - Interface
		//ChromeDriver - class
		//driver - object
		//EdgeDriver driver2 = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Get Commands in Selenium");
		
		driver.get("https://www.demo.guru99.com/test/newtours/"); //To pass web application url
		System.out.println(driver.getCurrentUrl()); //to find in which url user is present
		System.out.println(driver.getPageSource()); // to view page source of an application
		System.out.println(driver.getTitle()); //It will print title of my application
		driver.getWindowHandle(); // to handle single/parent window
		driver.getWindowHandles();//to handle multiple windows
		
		driver.close(); //closes my current opened browser
		driver.quit();//closes all opened browser of an application
		
		
		
		
		

	}

}
