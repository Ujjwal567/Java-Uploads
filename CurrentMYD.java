package DateTime;

import java.util.Calendar;
import java.util.Date;

public class CurrentMYD {

	public static void main(String[] args) {
		Date a = new Date();
		Calendar j = Calendar.getInstance();

		int year = j.get(Calendar.MONTH );
		System.out.println(year);
		
	}
}
