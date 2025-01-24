package AlertsPopupsImplicitFluentWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptAlertandImplicitWait
{
				static WebDriver driver;
				
				static WebElement PromptAlert,cnt_btn,cnt_btn1;
				
				public static void main(String[] args) throws ElementClickInterceptedException, InterruptedException
				{	
				WebDriver driver = new ChromeDriver();
				driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
				driver.manage().window().maximize();
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,1000)");
				
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				
				/*	//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));				
				//Pageload
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
				//Script - wait
				driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30)); */
				
				//Prompt ALert
				PromptAlert=driver.findElement(By.xpath("//input[@value='Say my name!']"));
				PromptAlert.click();
				
				
				System.out.println(driver.switchTo().alert().getText());
				// Get the message of alert pop up 
				driver.switchTo().alert().sendKeys("hai This is Sharmi");
				// Accept used for ok, done, yes
				driver.switchTo().alert().accept();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				//driver.close();
				
				//driver.switchTo().alert().dismiss(); //Dismiss used for cancel
				}}


