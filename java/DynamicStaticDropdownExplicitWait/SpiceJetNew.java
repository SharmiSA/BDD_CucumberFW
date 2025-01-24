package DynamicStaticDropdownExplicitWait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJetNew {
	
	public static WebElement Triptype, from, from_cities,To;
	
	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("-guest");
		options.addArguments("--disable-notifications");
   	    //options.addArguments("--remote-allow-origins=*");
			
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
				
		driver.get("https://www.spicejet.com/");
		
		System.out.println("Demo for Dynamic Dropdown");
		
		driver.findElement(By.xpath("//div[text()='round trip']")).click();
		
		from = driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]"));
		from.click();
		
		List<WebElement> from_City = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']"));
		
		int from_City_Count = from_City.size();
		
		System.out.println("Total no of from cities: " + from_City_Count);
		
		for(int i =0;i<=from_City_Count;i++)
		{
			String fromcityName = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']")).get(i).getText();
			System.out.println(fromcityName);
			
			if(fromcityName.equalsIgnoreCase("Vishakhapatnam"))
			{
				driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']")).get(i).click();
				System.out.println(fromcityName + " is Selected");
				break;
			}
			else
			{
				System.out.println("Not in the List");
			}
		}
		
		
		
	}}
