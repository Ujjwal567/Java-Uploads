package collectionFrameworkExrecise;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesettest {
public static void main(String[] args) {
	TreeSet t=new TreeSet(); 
	
	t.add(1);
	t.add(2);
	t.add(3);
	t.add(4);
	t.add(5);
	t.add(6);
	t.add(7);
	t.add(8);
	t.add(9);
	t.add(10);
	
	Iterator i=t.iterator();  
    while(i.hasNext())  
    {  
    System.out.println(i.next());  
    }  
	
}
}
