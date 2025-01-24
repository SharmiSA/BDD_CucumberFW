package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions 

//Hard Assert - When conditions fails,it will stop the execution
//Soft Assert - When conditions fails,it will not stop the execution, it will continue to execute till the last line
{
	String name="Maha";
	String name1="SharmiS";
	boolean value=true;
	
	@Test
	public void equals()
	{
	//Assert.assertEquals(name, name1);
	//Assert.assertNotEquals(name, name1);
	//Assert.assertTrue(value, "Its True");
	Assert.assertFalse(value, "Its false");
	}
}