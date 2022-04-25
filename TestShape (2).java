package inheritancaAndPolymorphims;

public class TestShape {
public static void main(String[] args) {
	
	Rectangle u = new Rectangle();
	Circle c = new Circle();
	
	c.setcolor("Black");
	c.setradius(7);
	c.setborderWidth(5);
	
	u.setlength(9.67f);
	u.setwidth(3);
	
	System.out.println(c.area());
	System.out.println(u.area());
	
	
	
	
	
}
}//end

