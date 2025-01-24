package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG // To pass multiple values for same condition
{	
	public static WebDriver driver;

	
	@BeforeTest
	public void LaunchBrowser()
	{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/newtours//");
	}
	
	@Test(dataProvider="testData",priority=2)
	public void newTours_Login(String Uname, String Pwd)
	{
	driver.findElement(By.name("userName")).sendKeys(Uname);
	driver.findElement(By.name("password")).sendKeys(Pwd);
	//driver.findElement(By.name("submit")).click();
	}

	@DataProvider(name="testData")
	public Object[][] LoginTestData()
	{
		Object[][] logindata = new Object[2][2];
		
		logindata[0][0] = "Mercury";
		logindata[0][1] = "Mercury";
		
		logindata[1][0] = "abc@gmail.com";
		logindata[1][1] = "abc";
		
		return logindata;
	}
	
	@Test(dataProvider="testData1, priority=1")
	public void newTours_Register(String Uname, String Pwd)
	{
	driver.findElement(By.name("userName")).sendKeys(Uname);
	driver.findElement(By.name("password")).sendKeys(Pwd);
	//driver.findElement(By.name("submit")).click();
	}

	@DataProvider(name="testData")
	public Object[][] RegisterTestData()
	{
		Object[][] Regdata = new Object[2][2];
		
		Regdata[0][0] = "Mercury";
		Regdata[0][1] = "Mercury";
		
		Regdata[1][0] = "abc@gmail.com";
		Regdata[1][1] = "abc";
		
		return Regdata;
	}
	
	 @AfterTest 
	 public void Exit()
	 {
	 driver.close();
	 }
}
