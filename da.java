package trypacage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class da {
	 public static void main(String[] args)
	    {
		 String oldDate = "2020-04-01";  
			System.out.println("Installation date :"+oldDate);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
	        Date now1 = new Date();
	        Date now2 = new Date();
	        DateFormat currentDate = DateFormat.getDateInstance();

	        Date addedDate1 = addDays(now2, 20);
	        Date addedDate2 = addDays(now1, 30);
	        System.out.println(currentDate.format(oldDate));
	        System.out.println(currentDate.format(addedDate1));
	        System.out.println(currentDate.format(addedDate2));
	    }

	    public static Date addDays(Date d, int days)
	    {
	        d.setTime(d.getTime() + days * 1000 * 60 * 60 * 24);
	        return d;
	    }
}
