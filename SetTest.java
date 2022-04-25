package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	
	
		public static void main(String[] args) {
			
			HashSet s = new HashSet();

			// Add elements 
			s.add("Shayam"); 
			s.add("Mohan"); 
			s.add("Ram");
			s.add(null);//at most one null  
			
			
			System.out.println(s.contains("Ram"));//methods of collection
			
			//print all elements by itreator
			Iterator it = s.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}

	

}
