package HandlingLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBrokenLinks 
{
	public static void main(String[] args) throws InterruptedException, Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int broken=0, notBroken=0;
		for(WebElement link:allLinks)
		{
		String href = link.getAttribute("href");
		String text = link.getText();
		System.out.println("Link: "+text);
		System.out.println("URL: "+href);
		try
		{
		URL url = new URL(href);
		HttpURLConnection con = (HttpURLConnection)
		url.openConnection();
		
		int code = con.getResponseCode();
		if(code==200)
		{
		System.out.println("Links is not broken....");
		notBroken++;
		}
		else
		{
		System.out.println("Link is broken1:");
		System.out.println(con.getResponseMessage());
		broken++;
		}
		}
		catch (Exception e)
		{
		System.out.println("Link is broken2:");
		broken++;
		}
		System.out.println("===============================================");
		}
		System.out.println("Total number of links: "+allLinks.size());
		System.out.println("Number of broken links: "+broken);
		System.out.println("Number of non broken links: "+notBroken);
		Thread.sleep(2000);
		driver.close();
		} 
}
