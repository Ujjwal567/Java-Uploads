package interfacetry;

public class TestInterface {
public static void main(String[] args) {
	
	
	Businessman1 a = new Businessman1();
	Businessman2 b = new Businessman2();
	Businessman3 c = new Businessman3();
	
	a.setname("Ujjwal");
	a.setaddress("India");
	
	b.setname("Ram");
	b.setaddress("America");
	
	c.setname("Shyam");
	c.setaddress("Australia");
	
	
	System.out.println(a.getname());
	System.out.println(a.getaddress());
	System.out.println(b.getname());
	System.out.println(b.getaddress());
	System.out.println(c.getname());
	System.out.println(c.getaddress());
	
	
	

	
	
	
	
	
	
	
	
}
}
