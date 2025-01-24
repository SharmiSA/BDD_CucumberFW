package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGPG 
{	
	@BeforeTest
	public void login()
	{
		System.out.println("Logging in to the application");
	}
	
	@Test(priority=0)
	public void searchProduct()
	{
		System.out.println("Searching a product in Flipkart application");
	}
	
	@Test(priority=1, enabled=false)
	public void addToCart()
	{
		System.out.println("Adding product to the cart");
	}
	
	@Test(priority=2)
	public void payment()
	{
		System.out.println("Making CC Payment");
	}
	
	@Test(priority=3)
	public void checkout()
	{
		System.out.println("Checking out from the cart");
	}
	
	@AfterTest
	public void logout()
	{
		System.out.println("Logging out from the application");
	}
	
}
