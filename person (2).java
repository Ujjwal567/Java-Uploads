package persontask;

import java.time.LocalDate;
import java.util.Date;


public class person {
private String name ;
private String address ;
public static final int Age = 45;
private Date todaydate;
private LocalDate date ;


public int setAge(){
	return Age;
}	

	public String getname(){
	return name;
	}
	public void setname(String n){
	name =n;
	}

public String getaddress(){
return address;
}
public void  setaddress(String d){
address = d;
}
	
	public Date gettodaydate(){
		return todaydate;
	}
	public void settodaydate(Date d){
		todaydate = d;
	}


public LocalDate getdate(){
	return date;
}
public void setdate(LocalDate  k){
	date = k;
}


}//end
	
	
	

