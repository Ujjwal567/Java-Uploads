package collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumeratorTest {
	
public static void main(String[] args) {
	
	Vector u = new Vector();
	
	u.add("one");
	u.add("Two");
	u.add("Three");
	u.add("four");
	
	System.out.println(u.size());
	
	//print all by enumeration
	Enumeration en = u.elements(); 
	while(en.hasMoreElements()){
		String g =(String) en.nextElement();
		System.out.println(g);
	}
	
}
}
