package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener  
{
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Case is yet to be Executed");
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Case is Passed");
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Case is Failed");
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Case is Skipped");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("Test Case is failed With in Success Percentage");
	}
	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("Executed Before Everything");
	}
	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("Executed After Everything");
	}
}
