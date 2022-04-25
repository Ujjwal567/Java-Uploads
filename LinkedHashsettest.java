package collectionFrameworkExrecise;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsettest {
public static void main(String[] args) {
	LinkedHashSet hs = new LinkedHashSet();
	
	hs.add(1);
	hs.add(2);
	hs.add(3);
	hs.add(4);
	hs.add(5);
	hs.add(6);
	hs.add(7);
	hs.add(8);
	hs.add(9);
	hs.add(10);
	
	Iterator i=hs.iterator();      while(i.hasNext())  
    {  
    System.out.println(i.next());  
    } 
	
}
}
