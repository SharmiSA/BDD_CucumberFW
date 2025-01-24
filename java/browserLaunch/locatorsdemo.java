package browserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatorsdemo 
{
	public static WebElement Uname,Pwd,Submit,regi_lnk;
	
	public static void main(String[] args) 
	{
	WebDriver driver = new FirefoxDriver();//Launching firefox browser
	
	driver.manage().window().maximize(); // maximizing screen
	
	driver.navigate().to("https://demo.guru99.com/test/newtours//"); //URL launch
	System.out.println(driver.getTitle()); //title of a webpage
	System.out.println(driver.getCurrentUrl()); //fetching curent url
	driver.navigate().refresh();
	
	driver.findElement(By.name("userName")).sendKeys("Mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("submit")).click();
	
//	System.out.println(driver.getTitle());
//	System.out.println(driver.getCurrentUrl());
//	driver.navigate().back();
//	System.out.println(driver.getTitle());
//	System.out.println(driver.getCurrentUrl());
//	driver.navigate().forward();
//	System.out.println(driver.getTitle());
//	System.out.println(driver.getCurrentUrl());
	
	//driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.partialLinkText("REGIS")).click();
	
	
	
//	driver.findElement(By.xpath("(//a[contains(text(),'Luxury Rails')])[2]"));
	
	//driver.close();
	}
}
