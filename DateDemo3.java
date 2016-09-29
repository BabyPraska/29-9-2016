import java.util.Date;
import java.text.*;
public class DateDemo3
{
	public static void main(String[] args)
	{
		Date date=new Date();
		SimpleDateFormat ft=new SimpleDateFormat();
	   System.out.println("current Date::"+ft.format(date));
		
	}
	
}
