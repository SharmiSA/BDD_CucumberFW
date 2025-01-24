package RobotClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadfileSample 
{

	public static void main(String[] args) 
	{
		EdgeOptions options = new EdgeOptions();
		options.addArguments("-guest");
		WebDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/autoit.html");	
		
		System.out.println("Frame count is: "+driver.findElements(By.tagName("iframe")).size());

		//Switching from current webdriver window to frame
		WebElement IframeElement =driver.findElement(By.xpath("//iframe[@title='Archive']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='Archive']")));
		driver.switchTo().frame(IframeElement);
				
		//driver.findElement(By.id("postjob")).click();			
		driver.findElement(By.id("input_3")).sendKeys("Sharmila");                                 					
	    driver.findElement(By.id("input_4")).sendKeys("christysharmila9@gmail.com");
	    
	    WebElement choosefile = driver.findElement(By.id("input_5"));
	    choosefile.click();
	    
	    choosefile.sendKeys("C:/Users/smaha/OneDrive/Pictures/pic/Sharmi.jpg");
	    driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");					
	    driver.findElement(By.id("input_2")).click();
	    System.out.println("Uploading a File via AutoIT is Successful");
	    
	   // driver.close();

	}

}
