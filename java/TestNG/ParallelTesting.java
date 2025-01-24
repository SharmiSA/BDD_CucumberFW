package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting
{
	public static WebDriver driver;
	
@Test
public void OpenSpiceJet()
{
	WebDriver driver = new ChromeDriver();
	
    driver.manage().window().maximize();
    
    driver.get("https://corporate.spicejet.com/default.aspx");
    
    System.out.println(driver.getTitle());
    
	System.out.println("SpiceJet Launched Successfully");
	
	driver.close();
}
@Test
public void OpenNewtours()
{
	WebDriver driver = new FirefoxDriver();
	
    driver.manage().window().maximize();
    
    driver.get("http://demo.guru99.com/test/newtours/index.php");
    
    System.out.println(driver.getTitle());
    
	System.out.println("NewTours Launched Successfully");
	
	driver.close();
}
}
