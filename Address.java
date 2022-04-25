package exerciseoop;

public class Address {
public static void main(String[] args) throws Exception  {
	
	Department d = new Department ("UJjwal","Mohan", "Ram");
	Employee f = new Employee ("Indore","Mandsaur",  "Delhi","Neemuch",  "Mumbai","Shmila");
	
	//Clone Of department
	/*Department d2 = (Department) d.clone();
	
	
	System.out.println(d.getEmployee());
	System.out.println(d.getEmployee2());
	System.out.println(d.getEmployee3());
	*/
	
	
	
	try {
		Object object = d.clone();
		
		d.setEmployee("Kishan");

		System.out.print("Employee 1 :"+d.getEmployee());
		System.out.print(" "+f.getAddressPermanent());
		System.out.print(" "+f.getLocalAddress());
		
		System.out.print("\nEmployeee 2 :"+d.getEmployee2());
		System.out.print(" "+f.getAddressPermanent2());
		System.out.print(" "+f.getLocalAddress2());
		
		System.out.print("\nEmployeee 2 :"+d.getEmployee3());
		System.out.print(" "+f.getAddressPermanent3());
		System.out.print(" "+f.getLocalAddress3());
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
