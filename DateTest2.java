import java.util.*;
import java.text.*;
public class DateTest2
{
  public static void main(String[] args)
  {
	   Date date=new Date();
	   SimpleDateFormat ft=new SimpleDateFormat("Eyyyy/mm/dd 'at' hh:mm:ss azzz");
	   System.out.println("current Date::"+ft.format(date));
  }
 }
