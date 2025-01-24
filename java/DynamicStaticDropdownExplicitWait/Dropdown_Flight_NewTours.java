package DynamicStaticDropdownExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Flight_NewTours
{
	public static WebElement FlightLink,triptype,Passcount,departfrom,departOnmonth,departOndate,ArrivalTo,ArrivalMonth,ArrivalDate;

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Demo for Static Dropdown");
        
		driver.get("http://demo.guru99.com/test/newtours/index.php");
        
        driver.findElement(By.xpath("//a[text()='Flights']")).click();
        System.out.println(driver.getTitle());
        
        driver.findElement(By.xpath("//input[@value='oneway']")).click();
        
        Passcount = driver.findElement(By.xpath("//select[@name='passCount']"));
        
        Select Pass_drpdwn = new Select(Passcount);
        Pass_drpdwn.selectByIndex(1);//selected index position
        
        departfrom = driver.findElement(By.name("fromPort"));
        Select departfrom_drpdwn = new Select(departfrom);
        departfrom_drpdwn.selectByValue("Paris");//selected value
        
        departOnmonth = driver.findElement(By.name("fromMonth"));
        Select departmonth_drpdwn = new Select(departOnmonth);
        departmonth_drpdwn.selectByVisibleText("May");//selected visibleText
        
        departOndate = driver.findElement(By.name("fromDay"));
        Select departdate_drpdwn = new Select(departOndate);
        departdate_drpdwn.selectByIndex(19);
        
        ArrivalTo = driver.findElement(By.name("toPort"));
        Select ArrivalTo_drpdwn = new Select(ArrivalTo);
        ArrivalTo_drpdwn.selectByValue("Zurich");
        

        ArrivalMonth = driver.findElement(By.name("toMonth"));
        Select ArrivalMonth_drpdwn = new Select(ArrivalMonth);
        ArrivalMonth_drpdwn.selectByVisibleText("July");
        
        ArrivalDate = driver.findElement(By.name("toDay"));
        Select ArrivalDate_drpdwn = new Select(ArrivalDate);
        ArrivalDate_drpdwn.selectByIndex(10);
        
        //Preferences
        
        driver.findElement(By.name("findFlights")).click();
	}

}
