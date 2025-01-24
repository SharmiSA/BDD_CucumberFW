package AlertsPopupsImplicitFluentWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertsAndPopup 
{
			public static WebDriver driver;
			public static WebElement SimpleAlert;
			
			public static void main(String[] args) throws InterruptedException
			{
				
				
				driver = new ChromeDriver();
				driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
				driver.manage().window().maximize();
				JavascriptExecutor js = (JavascriptExecutor) driver;//Typecasting method
				js.executeScript("window.scrollBy(0,1000)");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Simple ALert
				SimpleAlert=driver.findElement(By.xpath("//input[@value='Confirmation Alert']"));
				SimpleAlert.click();
								
				//accept, dismiss, gettext, sendkeys are the four methods of  alerts & Popups			
				String alerttext = driver.switchTo().alert().getText();// Get the message of alert pop up 
				System.out.println(alerttext);	
				
				 // Accept used for ok, done, yes
				driver.switchTo().alert().accept();
				driver.close();
				
				}
				}

		


	


