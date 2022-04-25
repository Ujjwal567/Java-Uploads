package exerciseDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Maintaince30d {
	public static void main(String args[]){
		
		String oldDate = "2020-04-01";  
		System.out.println("Installation date :"+oldDate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		/*try{
		   
		   c.setTime(sdf.parse(oldDate));
		}catch(ParseException e){
			e.printStackTrace();
		 }*/
		   
		
		c.add(Calendar.DAY_OF_MONTH, 30);  
		
		String newDate = sdf.format(c.getTime());  
		
		System.out.println("Maintence date :"+newDate);
		
		c.add(Calendar.DAY_OF_MONTH, 60);  
		
		String newDate2 = sdf.format(c.getTime());  
		
		System.out.println("Maintence date :"+newDate2);
		c.add(Calendar.DAY_OF_MONTH, 90);  
		
		String newDate3 = sdf.format(c.getTime());  
		
		System.out.println("Maintence date :"+newDate3);
		
		c.add(Calendar.DAY_OF_MONTH, 120);  
		
		String newDate4 = sdf.format(c.getTime());  
		
		System.out.println("Maintence date :"+newDate4);
		
		c.add(Calendar.DAY_OF_MONTH, 150);  
		
		String newDate5 = sdf.format(c.getTime());  
		
		System.out.println("Maintence date :"+newDate5);
		
c.add(Calendar.DAY_OF_MONTH, 180);  
		
		String newDate6 = sdf.format(c.getTime());  
		
		System.out.println("Maintence date :"+newDate6);
c.add(Calendar.DAY_OF_MONTH, 210);  
		
		String newDate7 = sdf.format(c.getTime());  
		
		System.out.println("Maintence date :"+newDate7);
		
c.add(Calendar.DAY_OF_MONTH, 240);  
		
		String newDate8 = sdf.format(c.getTime());  
		
		System.out.println("Maintence date :"+newDate8);
c.add(Calendar.DAY_OF_MONTH, 270);  
		
		String newDate9 = sdf.format(c.getTime());  
		
		System.out.println("Maintence date :"+newDate9);
c.add(Calendar.DAY_OF_MONTH, 300);  
		
		String newDate10 = sdf.format(c.getTime());  
		
		System.out.println("Maintence date :"+newDate10);
		
		
		
		
		
		
		
		
		

}
}