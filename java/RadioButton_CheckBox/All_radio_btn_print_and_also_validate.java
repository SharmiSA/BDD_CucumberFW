package RadioButton_CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_radio_btn_print_and_also_validate 
{
	
	public static void main(String[] args) throws ElementClickInterceptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.echoecho.com/htmlforms10.htm");
		
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			 
			 List li = driver.findElements(By.xpath("//td[@class='table5']//input[@name='group1']"));
			 int count = li.size();
			 System.out.println("Total Items present in Group1 catagory is: " + count);
			 
			 for(int i=0;i<=count;i++)
			 {
				String Group1_Items_Name = driver.findElements(By.xpath("//td[@class='table5']//input[@name='group1']")).get(i).getAttribute("value");
				System.out.println(Group1_Items_Name);
				
				if(Group1_Items_Name.equals("Milk"))
				{
					driver.findElements(By.xpath("//td[@class='table5']//input[@name='group1']")).get(i).click();
					System.out.println(Group1_Items_Name + " is selected from Group1 Items");
					break;
				}
				else
				{
					System.out.println(Group1_Items_Name + " is not selected from Group1 Items");
						
				}
				driver.close();
			 }
			 
			 
			
		}
}		
		
	