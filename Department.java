package exerciseoop;

public  class Department implements Cloneable {

	 private String Employee;
	 private String Employee2;
	 private String Employee3;
	 
	 private Address address;
	 
	  Department (String Employee,String Employee2,String Employee3){
		  this.Employee = Employee;
		  this.Employee2 = Employee2;
		  this.Employee3 = Employee3; 
		  this.address = address;
	  }
	 
	 
	public String getEmployee() {
		return Employee;
	}
	public void setEmployee(String employee) {
		Employee = employee;
	}
	
public String getEmployee2() {
return Employee2;
}
public void setEmployee2(String employee2) {
Employee2 = employee2;
}
	public String getEmployee3() {
	return Employee3;
	}
	public void setEmployee3(String employee3) {
	Employee3 = employee3;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Department d=(Department)super.clone();
		
		return d;
	}
	 @Override
	    public String toString() {
	        return Employee+""+Employee2+""+Employee3;
	    }
}

 
 
 
 
 
 