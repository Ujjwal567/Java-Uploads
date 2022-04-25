package persontask;

import java.time.LocalDate;

import java.util.Date;

public class TestPerson {
public static void main(String[] args) {
	
person p = new person();

	p.setname("Ram");
	p.setaddress("Indore , M.P");
	p.setAge();
	p.setdate(LocalDate.of(2005, 6, 16));
	p.settodaydate(new Date());
	
	
	
	System.out.println(p.getdate());
	System.out.println(p.setAge());
	System.out.println(p.getname());
	System.out.println(p.getaddress());
	System.out.println(p.gettodaydate());
	
	
}
}
