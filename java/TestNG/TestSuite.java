package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite 
{
	public static WebDriver driver;
	WebElement Triptype,drpdown_leaving_To,Search,drpdown_leaving_from,To_Date,tbl_leaving_from,tbl_leaving_to,Select_To_Date,From_Date,Select_From_Date;

@BeforeSuite
public void LaunchBrowser()
{
	driver = new ChromeDriver();
	
    driver.manage().window().maximize();
    
    driver.get("https://corporate.spicejet.com/default.aspx");
    
    System.out.println(driver.getTitle());
    
	System.out.println("SpiceJet Launched Successfully");
}

@Test(priority=1)

public void ChooseTriptype()
{
	Triptype=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));
	Triptype.click();
	System.out.println("Tip Type selected successfully");
}

@Test(priority=2)
public void Choose_From_To_City()
{
	drpdown_leaving_from = driver.findElement(By.xpath(".//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
	drpdown_leaving_from.click();
	
	tbl_leaving_from = driver.findElement(By.xpath(".//table[@id='citydropdown']"));
	
	//WebDriver Scope Limitation
	List<WebElement> lst_leaving_from = tbl_leaving_from.findElements(By.tagName("a"));
	
	System.out.println("The count of leaving from cities are "+lst_leaving_from.size());
	
	//Enhanced For Loop
	for(WebElement city:lst_leaving_from)
	{
		String city_name = city.getText();
		//System.out.println(city_name);
		if(city_name.contains("Ahmedabad"))
		{
			city.click();
			System.out.println(city_name+" is selected");
			break;
		}
		else
		{
			System.out.println("Not a Valid city Name for Destination Place");
		}
		
	}
	drpdown_leaving_To = driver.findElement(By.xpath(".//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
	drpdown_leaving_To.click();
	
	tbl_leaving_to = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//table[@id='citydropdown']"));
	
	//WebDriver Scope Limitation
	List<WebElement> lst_leaving_to = tbl_leaving_to.findElements(By.tagName("a"));
	
	System.out.println("The count of leaving To cities are "+lst_leaving_from.size());
	
	//Enhanced For Loop
	for(WebElement city:lst_leaving_to)
	{
		String city_name = city.getText();
		//System.out.println(city_name);
		if(city_name.contains("Hyderabad (HYD)"))
		{
			city.click();
			System.out.println(city_name+" is selected");
			break;
		}
		else
		{
			System.out.println("\"Not a Valid city Name for Arrival Place");
		}
	}
}
@Test(priority=3)
public void Choose_From_To_Date()
{
	try
	{
		From_Date= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		From_Date.click();			
	}
	catch(ElementNotInteractableException e)
	{
		e.getMessage();
	}
	
	try
	{
		Select_From_Date= driver.findElement(By.xpath("//td[@data-year='2024' and @data-month='7']//a[text()='3']"));
		Select_From_Date.click();
	}
	catch(ElementNotInteractableException e)
	{
		e.getMessage();
	}
	try
	{
		To_Date= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']"));
		To_Date.click();
	}
	catch(ElementNotInteractableException e)
	{
		e.getMessage();
	}
	try
	{
		Select_To_Date= driver.findElement(By.xpath("//td[@data-year='2024' and @data-month='7']//a[text()='10']"));
		Select_To_Date.click();
	}

	catch(ElementNotInteractableException e)
	{
		e.getMessage();
	}}

@Test(priority=4)
public void Choose_Passengers()
{
	WebElement drpdwn_passengers=driver.findElement(By.xpath("//div[text()='1 Adult']"));
	drpdwn_passengers.click();
	
	try
	{
	WebElement drpdwn_adult=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
	drpdwn_adult.click();
	
	Select s = new Select(drpdwn_adult);
	s.selectByIndex(5);
	}
	
	catch(ElementNotInteractableException e)
	{
		e.getMessage();
	}
	
	try
	{
	WebElement drpdwn_child=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
	drpdwn_child.click();
	
	Select s1 = new Select(drpdwn_child);
	s1.selectByIndex(3);
	}
	
	catch(ElementNotInteractableException e)
	{
		e.getMessage();
	}
	try
	{
	WebElement drpdwn_infant=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']"));
	drpdwn_infant.click();
	
	Select s2 = new Select(drpdwn_infant);
	s2.selectByIndex(0);
	}
	catch(ElementNotInteractableException e)
	{
		e.getMessage();
	}
}
@Test(priority=5)
public void Choose_Currency()
{
	try
	{
	WebElement drpdwn_currency=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
	drpdwn_currency.click();
		
	Select s3 = new Select(drpdwn_currency);
	s3.selectByIndex(1);
	}
	catch(ElementNotInteractableException e)
	{
		e.getMessage();
	}
	
}
@Test(priority=6)
public void Choose_Checkbox()
{
	List<WebElement> listchkbox=driver.findElements(By.xpath(".//*[contains(@class,'row1 padding-bottom-3 home')]//div/input"));
	
	System.out.println("Checkbox type count - "+listchkbox.size());
	
	for(int i=0;i<listchkbox.size();i++)
	{	
		String chkboxName=driver.findElements(By.xpath(".//*[contains(@class,'row1 padding-bottom-3 home')]//div/label")).get(i).getText();
		System.out.println("CheckBox Name:" + chkboxName);
		/* Family & Friends
		 Sr. Citizen
		 Armed Forces
		 LTC Fare
		 Govt. Employee
		 Student
		 Unaccompanied Minor
		 Health Professional
		 */

		if(chkboxName.equals("Armed Forces"))
		{
			listchkbox.get(i).click();
			String tooltip = driver.findElements(By.xpath(".//*[contains(@class,'row1 padding-bottom-3 home')]//div//span")).get(i).getText();
			System.out.println(chkboxName+" tooltip content is "+tooltip);
			break;
		}
		else
		{
			System.out.println(chkboxName+" not matched");
		}	
	}
}
	
	@Test(priority=7)
	public void Search()
	{
	Search=driver.findElement(By.xpath(".//input[@id='ctl00_mainContent_btn_FindFlights']"));
	Search.click();
	
}
@AfterSuite
public void CloseBrowser()
{
	driver.close();
}

}