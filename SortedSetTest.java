package collectionFramework;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
public static void main(String[]args){
	SortedSet z = new TreeSet();
	z.add("Ujjwal ");
	z.add("Ram ");
	z.add("Shayam ");
	z.add("Mohan ");
	z.add("Ajay ");
	
	//in asending order
	for(Object e: z){
		System.out.print(e);
	}
	
	
	
	System.out.println(z.contains("Ujjwal"));
	
	System.out.println(z.first());
	
	System.out.println(z.last());
	
}
}
