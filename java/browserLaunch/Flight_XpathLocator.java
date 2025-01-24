package browserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flight_XpathLocator 
{
	public static WebElement flight_Link, triptype;
	
	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/newtours//"); //URL launch
		System.out.println(driver.getTitle()); //title of a webpage
		System.out.println(driver.getCurrentUrl()); //fetching curent url
		
		driver.findElement(By.xpath("//a[text()='Flights']")).click();
		//driver.findElement(By.xpath("//input[@value='oneway']")).click();
	
		driver.findElement(By.xpath("//input[contains(@value,'oneway')]")).click();
		
		
		
		


	}

}
