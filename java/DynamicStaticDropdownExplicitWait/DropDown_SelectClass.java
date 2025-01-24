package DynamicStaticDropdownExplicitWait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_SelectClass 
{
	public static WebElement registerlink,fname,lname,phone,email,address,city,state,pcode,country;
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours/index.php");

        driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
            
        fname = driver.findElement(By.cssSelector("input[name=firstName]"));
        fname.sendKeys("Shalini");
        
        lname = driver.findElement(By.cssSelector("input[name=lastName]"));
        lname.sendKeys("Shilpa");
        
        phone = driver.findElement(By.cssSelector("input[name=phone]"));
        phone.sendKeys("9898989898");
        
        email = driver.findElement(By.cssSelector("input#userName"));
        email.sendKeys("shalini12@gmail.com");
        
        address = driver.findElement(By.cssSelector("input[name=address1]"));
        address.sendKeys("abc");
        
        city = driver.findElement(By.cssSelector("input[name=city]"));
        city.sendKeys("Chennai");
        
        state = driver.findElement(By.cssSelector("input[name=state]"));
        state.sendKeys("TN");
        
        pcode = driver.findElement(By.cssSelector("input[name=postalCode]"));
        pcode.sendKeys("987612");
              
        List<WebElement> dropdownli = driver.findElements(By.xpath("//select[@name='country']//option"));
        int count = dropdownli.size();
        System.out.println(count);
       
        for(int i=0;i<count;i++) 
        {
        	String dropdownname = driver.findElements(By.xpath("//select[@name='country']//option")).get(i).getText();
        	System.out.println(dropdownname);
        	
        	if(dropdownname.equalsIgnoreCase("CYPRUS"))
        	{
        		dropdownli.get(i).click();
        		System.out.println(dropdownname + "is selected");
        		break;
        	}
        	else
        	{
        		System.out.println("No Country is Selected");
        	}
        	
        }
        
        /*  country = driver.findElement(By.name("country"));
        Select s = new Select(country);
        //s.selectByIndex(3);
        //s.selectByValue("ARUBA");
        s.selectByVisibleText("AUSTRALIA");
        
        */
        
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("JR");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("JR123");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("JR123");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        
        driver.close();

	}

}
