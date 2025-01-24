package browserLaunch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Edge_Browser_Locators_CSSSelector
{	
	public static WebElement Uname,pwd,submit, Suc_msg;
	
	public static void main(String args[]) throws InterruptedException
	{
		EdgeOptions options = new EdgeOptions();
		options.addArguments("-guest");
		
		//options.addArguments("--disable-notifications");
   	    //options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new EdgeDriver(options);//Instantiation of an class via an Interface
		 
		 driver.manage().window().maximize(); ///Maximize the Screen
				 
		 System.out.println("Demo for CSS Selector");
		 
		 driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("9898989898"); //Tag and Attribute 
		 
		 //driver.findElement(By.cssSelector("input.userName")).sendKeys("shalini@gmail.com"); Tag and Class 
		// driver.findElement(By.cssSelector("input.email[name=’phone’]")).sendKeys("9898989898"); //Tag, Class and Attribute 
		 
//		 driver.findElement(By.cssSelector("input#userName")).sendKeys("shalini@gmail.com"); //Tag and ID 
	 
//		 driver.findElement(By.partialLinkText("Flig")).click();
//		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.cssSelector("a.contains('Flig')")).click(); //InnerText 
		 driver.findElement(By.xpath("//input[@value='oneway']"));
		 
		 
		 
		 
				 
		
	 
		 //driver.close();	
	}
}
