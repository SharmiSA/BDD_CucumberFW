package browserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Browser_NavigationCommands_Demo
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		System.out.println("Navigation Commands in Selenium");
		System.out.println(" ");

		
		driver.navigate().to("https://demo.guru99.com/test/newtours//"); // another way of launching a browser
		System.out.println(driver.getCurrentUrl());//To print the url of an application
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://demo.guru99.com/test/newtours//register.php"); 
		System.out.println(driver.getCurrentUrl());//To print the url of an application
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println("Backward Navigation: " + driver.getCurrentUrl());//To print the url of an application
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("Forward Navigation: " + driver.getCurrentUrl());//To print the url of an application
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		//driver.close();
	
		
}
}
