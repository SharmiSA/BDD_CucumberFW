package DynamicStaticDropdownExplicitWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiRadioButton
{
	public static WebElement charter, addons,Search,RndTriptype,Select_To_Date,To_Date,Select_From_Date,From_Date,tbl_leaving_to,drpdown_leaving_To, drpdown_leaving_from,tbl_leaving_from;
	
	public static void main(String[] args) throws ElementNotInteractableException
	{
		EdgeOptions options = new EdgeOptions();
		options.addArguments("-guest");
		WebDriver driver = new EdgeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		//Single radioButton
			//WebElement Triptype = driver.findElement(By.xpath("//div[text()='round trip']"));
			//Triptype.click();
					
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa']"));
		int tripcount =  li.size();
		System.out.println("Trip Type Count: " + tripcount);
		
		for(int i=0;i<tripcount;i++)
		{
			String TriptypeName = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa']")).get(i).getText();
			System.out.println("Trip Name is: " + TriptypeName);
			
			if(TriptypeName.equalsIgnoreCase("Round Trip"))
			{	
				driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa']")).get(i).click();
				
				System.out.println("Round Trip is Selected");
			}
			else
			{
				System.out.println("Round Trip type is not Selected");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		/*for (int i=0;i<tripcount;i++)
		{
			String RadiobtnName = driver.findElements(By.xpath("//table[@id='ctl00_mainContent_rbtnl_Trip']//label")).get(i).getText();
			System.out.println("RadioButton Name: "+ RadiobtnName);
						
			if(RadiobtnName.equals("Multicity"))
			{
				driver.findElements(By.xpath("//table[@id='ctl00_mainContent_rbtnl_Trip']//label")).get(i).click();
				
				System.out.println(RadiobtnName +" is selected");
				
				driver.findElement(By.xpath("//a[text()='Ok']")).click();
				break;
			}
			else
			{
				System.out.println(RadiobtnName +" is not selected");
			}
			}
		driver.close(); //closes the current browser
		//driver.quit(); //closes all the opened browsers
	*/
	}
}
	
