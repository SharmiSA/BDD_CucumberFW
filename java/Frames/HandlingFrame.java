package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingFrame 
{
	static WebElement lnkSignup,btn_signupwithEmail,btn_FB,txtboxEmail,txtboxPassword,btnProceed,txtboxMobilenumber,btnClose,divArrow;
	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(opt);
		System.out.println(driver);
		
		 driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
	   
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		driver.findElement(By.xpath("//span[text()='Login/ Sign Up']")).click();
				   
		System.out.println("SignIn Page Opened Successfully");
		  
		WebElement IframeElement =driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		
		//Switching from current webdriver window to frame
		driver.switchTo().frame(IframeElement);
		driver.findElement(By.id("mobileNoInp")).sendKeys("8939744423");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.findElement(By.xpath("(//div[@class='recaptcha-checkbox-border'])[1]")).click();
		driver.findElement(By.xpath("//div//span[text()='GENERATE OTP ']")).click();
		
				   
		// to come out from Frame
		driver.switchTo().defaultContent();
		//driver.close();
				
	
	}
}
