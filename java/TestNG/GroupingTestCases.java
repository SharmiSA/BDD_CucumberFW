package TestNG;

import org.testng.annotations.Test;

public class GroupingTestCases
{
@Test(groups= {"Regression"})
public void Testing()
{
	System.out.println("Testing Job is Posted");
}
@Test(groups= {"Regression"})
public void Development()
{
	System.out.println("Development Job is Posted");
}
@Test(groups= {"Regression"})
public void Support()
{
	System.out.println("Support Job is Posted");
}
@Test(groups= {"Smoke"})
public void Architect()
{
	System.out.println("Architect Job is Posted");
}
@Test(groups= {"Smoke"})
public void BusinessAnalyst()
{
	System.out.println("BusinessAnalyst Job is Posted");
}
@Test(groups= {"Sanity"})
public void ProjectManager()
{
	System.out.println("ProjectManager Job is Posted");
}
@Test(groups= {"Sanity"})
public void DeliveryManager()
{
	System.out.println("DeliveryManager Job is Posted");
}
}
