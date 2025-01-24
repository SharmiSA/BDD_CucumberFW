package RobotClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFile_SendKeys 
{
	public static void main(String[] args) throws ElementNotInteractableException
	{
		EdgeOptions options = new EdgeOptions();
		options.addArguments("-guest");
		WebDriver driver = new EdgeDriver(options);
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://github.com/settings/profile");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login_field")).sendKeys("christysharmila9@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Shalex@57");
		driver.findElement(By.name("commit")).click();
		
		WebElement Edit = driver.findElement(By.xpath("//div[@class='position-absolute color-bg-default rounded-2 color-fg-default px-2 py-1 left-0 bottom-0 ml-2 mb-2 border']"));
		Edit.click();
		WebElement uploadpic =driver.findElement(By.xpath("//details-menu[@class='dropdown-menu dropdown-menu-se']//label[@class='dropdown-item text-normal']"));
		uploadpic.click();
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(uploadpic));
		
		try 
		{
		// Add file method 

			uploadpic.sendKeys("C:/Users/smaha/OneDrive/Pictures/Pic/Sharmi.jpg");// For setting a profile picture
		}
		catch(ElementNotInteractableException e)
		{
			e.printStackTrace();
		}
		WebElement setpic =driver.findElement(By.xpath("//span[text()='Set new profile picture']"));
		setpic.click();
				

	}

}
