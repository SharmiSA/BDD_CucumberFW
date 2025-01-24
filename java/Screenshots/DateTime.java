package Screenshots;
import java.util.Date;

public class DateTime {

	public static void main(String[] args)
	{
		Date d = new Date();
		System.out.println(d);
		String filename = d.toString().replace(" ", "_").toString().replace(":", "_");
		System.out.println(filename);
	}

}
