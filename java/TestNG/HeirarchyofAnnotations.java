package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HeirarchyofAnnotations
{
  @Test
  public void Test() 
  {
	  System.out.println("Iam Test- Marks a class or a method as part of the test");
  }

  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Iam Before Method - I will run before each test method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Iam After Method - I will run after each test method");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Iam Before Class - I will run only once before the first method in my current class gets Invoked");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("Iam After Class - I will run only once after all the test methods in my current class gets Run");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Iam Before Test - I will run before any test method belonging to the classes inside the <test> tag is run");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("Iam After Test- I will run after all the test methods belonging to the classes inside the <test> tag have run");
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("Iam Before Suite - I will run only once before all the tests in the suite have run");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("Iam After Suite - will be run only once after all the tests in this suite have run");
  }

}
