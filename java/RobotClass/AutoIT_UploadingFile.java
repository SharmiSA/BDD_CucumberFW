package RobotClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutoIT_UploadingFile 
{
public WebDriver driver;
@BeforeClass
public void setUp() throws Exception 
{
driver = new ChromeDriver();
}

@Test
public void UploadTest() throws Exception 
{
driver.get("https://github.com/settings/profile");
driver.manage().window().maximize();

driver.findElement(By.id("login_field")).sendKeys("christysharmila9@gmail.com");
driver.findElement(By.id("password")).sendKeys("Shalex@57");
driver.findElement(By.name("commit")).click();

WebElement Edit = driver.findElement(By.xpath("//div[@class='position-absolute color-bg-default rounded-2 color-fg-default px-2 py-1 left-0 bottom-0 ml-2 mb-2 border']"));
Edit.click();
WebElement uploadpic =driver.findElement(By.xpath("//details-menu[@class='dropdown-menu dropdown-menu-se']//label[@class='dropdown-item text-normal']"));
uploadpic.click();
// Mention the own path of the file location

// Add file method 
uploadpic.sendKeys("C:/Users/smaha/OneDrive/Pictures/pic/Sharmi.jpg");// For setting a profile picture

driver.findElement(By.linkText("Set new profile picture")).click();
Thread.sleep(2000);// Image name can be of your choice

if(driver.findElement(By.xpath(".//a[text()='caps.jpeg']")).isDisplayed())
{
assertTrue(true, "Profile picture is Uploaded");
}
else
{
assertTrue(false, "Profile picture not Uploaded");
}
}
@AfterClass
public void tearDown() throws Exception
{
driver.quit();
}
}
