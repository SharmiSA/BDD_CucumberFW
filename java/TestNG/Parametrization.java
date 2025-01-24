package TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization 
{
@Test
@Parameters({"Email"})

//public void Enteremail(String email)
public void Enteremail1(String email)
{
	
	//System.out.println("My Email Address is"+" christysharmila9@gmail.com");
	System.out.println("My Email Address is "+ email);

}

}
