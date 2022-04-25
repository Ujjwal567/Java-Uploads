package collectionFramework;

public class Comparable1 implements Comparable<Comparable1>{

	public String rollno;
	public String name;
	public  String marks;
	public String Address;
	public  Comparable1(String r,String n,String m,String k){
		this.rollno = r;
		this.name = n;
		this.marks  =m ;
		this.Address = k;
	}
	
	public int compareTo(Comparable1 o) {
		
		return name.compareTo(o.name);

	}
		
		public String toString() {
			return rollno+","+name+","+marks+","+"Address";
		}
	}