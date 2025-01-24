package browserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators 
{
	public static WebElement email,Pwd,loginbtn,backpack;
	public static void main(String[] args)
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");//sendkeys - Used to pass value in a textbox
		driver.findElement(By.id("password")).sendKeys("secret_sauce");//findElement - returns the location of a particular webelement
		driver.findElement(By.name("login-button")).click();
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@name='checkout']")).click();
		driver.findElement(By.id("first-name")).sendKeys("Sharmi");
		driver.findElement(By.id("last-name")).sendKeys("Mathew");
		driver.findElement(By.id("postal-code")).sendKeys("603209");
		driver.findElement(By.name("continue")).click();
		driver.findElement(By.name("finish")).click();
		
		WebElement Thankyoumsg = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')] "));
		String a  = Thankyoumsg.getText();
		System.out.println(a); 
		
		WebElement Ordermsg = driver.findElement(By.xpath("//div[contains(text(),'Your order has been dispatched')] "));
		String b  = Ordermsg.getText();
		System.out.println(b); 
		
		driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small' and @id='back-to-products']")).click();
		driver.close();//Close the current window
//		driver.quit();//Closes all the opened windows of an application.



		

	}

}
