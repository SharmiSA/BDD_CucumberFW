package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_DoubleClick_RightClick 
{
	public static void main(String[] args) throws InterruptedException 
	
	 
	   //build - it is used to create an action
	   //perform - Used to execute an action which is created by build.
	
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/buttons");
	    System.out.println("demoqa webpage displayed");
		driver.manage().window().maximize();
	 
		WebElement clk = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		Actions c = new Actions(driver);
		c.click(clk).build().perform();
		 
		 WebElement clkmsg = driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));
		 String clkmsgtext = clkmsg.getText(); 
		 System.out.println(clkmsgtext);
				 
		 WebElement dblclk = driver.findElement(By.id("doubleClickBtn"));
		
		 Actions a = new Actions(driver);
		 a.doubleClick(dblclk).build().perform();
	     
		 WebElement dbleclkmsg = driver.findElement(By.id("doubleClickMessage"));
		 String Dbleclkmsgtext = dbleclkmsg.getText();
		 System.out.println(Dbleclkmsgtext);
	   
		 WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
		 
		 Actions actions = new Actions(driver);
		 actions.contextClick(btnElement).build().perform();
		 
		 WebElement Rightclkmsg = driver.findElement(By.id("rightClickBtn"));
		 String Rightclkmsgtxt = Rightclkmsg.getText();
		 System.out.println(Rightclkmsgtxt);
	    
		 driver.close();
	   
}

}