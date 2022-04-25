package DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class first {
public static void main(String[] args) throws ParseException {
	//import = java.util.Date;
	Date today =new Date ();
	SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
	//SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MM.dd G 'at'hh:mm:ss z");
	//SimpleDateFormat format1 = new SimpleDateFormat("K.mm a,z");
	//SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MMMMMM.dd GGG hh:mm aaa");
	//SimpleDateFormat format1 = new SimpleDateFormat("EEE,MMM d,''yy");
	//SimpleDateFormat format1 = new SimpleDateFormat("K:mm a,z");
	//SimpleDateFormat format1 = new SimpleDateFormat("SSSSS/KK/Z");//own

	String D= format1.format(today);
	System.out.println(D);
	
	//
	SimpleDateFormat Format2 = new SimpleDateFormat("MMM dd,yyyy");
	String StrDate = Format2.format(today);
	System.out.println(StrDate);
	
	Date h = format1.parse("16/12/2006");
	System.out.println(h);
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
