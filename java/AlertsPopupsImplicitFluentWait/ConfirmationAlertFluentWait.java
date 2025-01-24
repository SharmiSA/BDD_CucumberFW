package AlertsPopupsImplicitFluentWait;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ConfirmationAlertFluentWait
{
static WebDriver driver;
				
static WebElement confirm_Alert,cnt_btn;
			
public static void main(String[] args) throws InterruptedException
		
{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptconfirm.php");
					
		driver.manage().window().maximize();	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		//Confirmation ALert
		confirm_Alert=driver.findElement(By.xpath("//input[@value='Leave Tizag.com']"));
		confirm_Alert.click();
		
		String Confirmalerttext = driver.switchTo().alert().getText(); // Get the message of alert pop up 
		System.out.println(Confirmalerttext);	
		
		FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver);
		w.withTimeout(Duration.ofSeconds(30));
		w.ignoring(InterruptedException.class);
		w.pollingEvery(Duration.ofSeconds(45));
		w.until(ExpectedConditions.alertIsPresent());
			
		driver.switchTo().alert().dismiss();
					
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		// Accept used for ok, done, yes
		driver.switchTo().alert().accept();
					
		driver.quit();
		
											
	}
}

			


		




