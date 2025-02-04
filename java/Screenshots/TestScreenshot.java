package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScreenshot 
{
	public static WebDriver driver;
	
	//1st Method
	 public static void capturescreenshot(WebDriver driver) throws IOException
	{
		System.out.println("Taking Screenshot");
		
		Date d = new Date();
		System.out.println(d);
		
		String filename = d.toString().replace(" ", "_").toString().replace(":", "_");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest1 = new File("C:\\TestLeaf_Automation\\Topics_Selenium\\src\\main\\java\\Screenshots\\"+filename);
		File dest = new File("./ScreenshotTest/Webdriver.jpeg");
		FileUtils.copyFile(src, dest1);
		FileUtils.copyFile(src, dest);
	}
		
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();		 
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		capturescreenshot(driver);
		
		driver.close();
	}
}
	
	
		
		
		

	