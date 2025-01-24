package Screenshots;

import java.util.Date;

public class DateAndTime 
{
	public void dateTime()
	{
		Date d=new Date();
		//System.out.println("System's Date and Time is :" + d); 
		String filename = d.toString().replace(":", "_").replace(" ", "_") + ".jpeg";
		System.out.println(filename); 
	}
	public static void main(String[] args) 
	{	
		DateAndTime d = new DateAndTime();
		d.dateTime();
		
//		public static void main(String[] args) 
//		{
//		Date d=new Date();
//		System.out.println("System's Date and Time is :" + d); 
//		}		
}}


