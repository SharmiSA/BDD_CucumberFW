package TestNG;

import org.testng.annotations.Test;

public class TestNGPrioritySkip
{
@Test(priority=0, enabled=false)
public void Register()
{
System.out.println("Registering to Flipkart");  	
}

@Test(priority=1)
public void Login()
{
System.out.println("Logging into Flipkart");  	
}

@Test(priority=2)
public void AddtoCart()
{
System.out.println("Adding produt to Cart");  	
}

@Test(priority=3)
public void CheckOut()
{
System.out.println("Checkout from Cart");  	
}
@Test(priority=4)
public void Payment()
{
System.out.println("Make Payment");  	
}

@Test(priority=5, enabled = true)
public void Logout()
{
System.out.println("Logging out from Flipkart");  	
}
}
