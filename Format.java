package DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format {
public static void main(String[] args) throws ParseException    {
	Date a= new Date();
	SimpleDateFormat format= new 
	SimpleDateFormat("dd/MM/yyyy");
	//System.out.println(""+ format);
	//System.out.println(""+ a);
	String s = format.format(a);
	System.out.println(s);
	String d = "05/04/2029";
	Date d1 = format.parse(d);
	System.out.println(d1);
			
}
}
