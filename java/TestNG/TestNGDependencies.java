package TestNG;

import org.testng.annotations.Test;

public class TestNGDependencies
{
@Test(enabled=true, priority=1)
public void Register()
{
System.out.println("Register Functionality");  	
}

@Test(priority=2, dependsOnMethods="Register")
public void Login()
{
System.out.println("Login Functionality");  	
}

@Test(priority=3)
public void AddCart()
{
System.out.println("Add to Cart Functionality");  	
}

@Test(priority=4)
public void Payment()
{
System.out.println("Payment Functionality");  	
}

@Test(priority=5)
public void Checkout()
{
System.out.println("Checkout Functionality");  	
}
}
