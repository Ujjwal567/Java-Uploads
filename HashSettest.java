package collectionFrameworkExrecise;

import java.util.HashSet;
import java.util.Iterator;

public class HashSettest {
	public static void main(String[] args) {
		
	
	HashSet s = new HashSet();
	
	s.add(1);
	s.add(2);
	s.add(3);
	s.add(4);
	s.add(5);
	s.add(6);
	s.add(7);
	s.add(8);
	s.add(9);
	s.add(10);
	
	Iterator<String> i=s.iterator();  
    while(i.hasNext())  
    {  
    System.out.println(i.next());  
    }  
	
	
}
}