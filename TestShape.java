package exerciseoop;

import inheritancaAndPolymorphims.Circle;
import inheritancaAndPolymorphims.Rectangle;

public class TestShape {
public static void main(String[] args) {
	
	Rectangle u = new Rectangle();
	Circle c = new Circle();
	Triangle t = new Triangle();
	
	c.setcolor("Black");
	c.setradius(7);
	c.setborderWidth(5);
	
	u.setlength(9.67f);
	u.setwidth(3);
	
	t.setBase(5);
	t.setHeight(4);
	
	
	System.out.println(t.area());
	System.out.println(c.area());
	System.out.println(u.area());
}
}
