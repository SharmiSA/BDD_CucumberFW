package RadioButton_CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class CheckBox_echoecho 
{
	public static void main(String[] args)throws ElementClickInterceptedException
	{
		EdgeOptions options = new EdgeOptions();
		options.addArguments("-guest");
		WebDriver driver = new EdgeDriver(options);
		
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		
		//CheckBox - 3Methods
		//a) isDisplayed()
		//b) isSelected()
		//c) isEnabled()
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)", "");
		
		//To select particular checkbox or handle single checkbox
		/*WebElement cheese = driver.findElement(By.name("option3"));
		cheese.click();
		
		if(cheese.isSelected())
		{
			System.out.println("Cheese Option is Selected");
		}
		else
		{
			System.out.println("Cheese Option didn't get Selected");
		} */
		int count = driver.findElements(By.xpath("//td[@class='table5']//input[@type='checkbox']")).size();
		System.out.println("Total no of CheckBoxes:" + count);
		
		for (int i=0;i<count;i++)
		{
			String chkbxName = driver.findElements(By.xpath("//td[@class='table5']//input[@type='checkbox']")).get(i).getAttribute("value");
						
			if(chkbxName.equals("Cheese"))
			{
				driver.findElements(By.xpath("//td[@class='table5']//input[@type='checkbox']")).get(i).click();
				System.out.println(chkbxName +" is selected");
				break;
			}
			else
			{
				System.out.println(chkbxName +" is not selected");
			}
	}}
	}

