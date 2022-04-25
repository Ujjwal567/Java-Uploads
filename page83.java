package DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class page83 {
public static void main(String[] args) {
	//Writing Date and Time
	//current date 
	//Date f = new Date();
	//System.out.println(f);
	
	//long Time = 10*60*1000 ;//time is 5:30 hour ahead
	//Date d = new Date(Time);
	//System.out.println(d);
	
	//Date Time Formating and Parsing
	Date r = new Date ();
	SimpleDateFormat format1 = new SimpleDateFormat("YYYY/MMMMM/dd");
	String j = format1.format(r);// given Format as format1 and format
	System.out.println(""+j);//print Date in given Format
	System.out.println(""+ r);//print current System Date 
	
	//Second format
	SimpleDateFormat format2 = new SimpleDateFormat("DD/MMMMM/YYYY");
	String k = format2.format(r);
	System.out.println(""+ k);
}
}



