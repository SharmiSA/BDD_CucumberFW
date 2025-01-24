//https://testng.org/testng-eclipse-update-site

package TestNG;

import org.testng.annotations.*;

public class TestNGExample
{
@Test(priority=1)
public void FirstTC()
{
System.out.println("First Test Case");  	
}

 @Test (priority=2)
 public void SecondTC() 
 {
	 System.out.println("Second Test Case"); 
 }
 
 @Test(priority=3)
 public void ThirdTC() 
 {
	 System.out.println("Third Test Case"); 
 }
 
 @Test(priority=4)
 public void FourthTC() 
 { 
	 System.out.println("Fourth Test Case"); 
 }
 @Test(priority=5)
 public void FifthTC() 
 {
	 System.out.println("Fifth Test Case"); 
 }
 
 @Test(priority=6)
 public void SixthTC() 
 {
	 System.out.println("Sixth Test Case"); 
 }
 }
