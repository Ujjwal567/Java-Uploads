package DateTime;

import java.util.Calendar;
import java.util.Date;

public class dataarthematics {



public static void main(String[] args) {
	Date today = new Date();
	//Calendar and time zone current 
	Calendar cal= Calendar.getInstance();
	
	//Current Time
	cal.setTime(today);
	System.out.println("" +cal);
	//Get year of date
	int Year = cal.get(Calendar.DAY_OF_YEAR);
	System.out.println(""+Year);
	//for Yesterday date
	cal.add(Calendar.DATE, -1);
	Date yesterday = cal.getTime();
	
	System.out.println("" +yesterday);
	cal.add(Calendar.DATE, 30);
	
	Date nextEvent = cal.getTime();
	System.out.println(""+nextEvent);
	
	
	
}
}
