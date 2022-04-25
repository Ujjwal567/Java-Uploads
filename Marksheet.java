package collectionFramework;


public class Marksheet implements Comparable<Marksheet> {
	public String rollno;
	public String name;
	public  String marks;
	public String Address;
	public  Marksheet(String r,String n,String m,String k){
		this.rollno = r;
		this.name = n;
		this.marks  =m ;
		this.Address = k;
	}
	public String toString() {
		return rollno+","+name+","+marks+","+"Address";
	}
	
	public int compareTo(Marksheet o) {
		
		return name.compareTo(o.name);
	}
public int compareTo1(Marksheet o) {
		
		return marks.compareTo(o.marks);
	}


	
	
	
	}

