package RadioButton_CheckBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radiobutton 
{
	public static WebElement Cheese_rdbtn1, water_rdbtn2;
	
	public static void main(String[] args) throws ElementClickInterceptedException
	{
		EdgeOptions options = new EdgeOptions();
		options.addArguments("-guest");
//		options.addArguments("--disable-notifications");
//		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		System.out.println(driver.getTitle());	
		
		Cheese_rdbtn1 = driver.findElement(By.xpath("//input[@value='Cheese']"));
		Cheese_rdbtn1.click();
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(Cheese_rdbtn1));
		Cheese_rdbtn1.click();
		
		System.out.println("Cheese option is selected from Group 1");
		
		water_rdbtn2 = driver.findElement(By.xpath("//input[@value='Water']"));
		water_rdbtn2.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait2.until(ExpectedConditions.visibilityOf(water_rdbtn2));
		water_rdbtn2.click();
		
		System.out.println("Water option is selected from Group 2");	
		
		driver.close(); 
	}	
}
