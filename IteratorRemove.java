package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {
	
	   public static void main(String[] args) {
		   
	      ArrayList p = new ArrayList();
	      
	      p.add("Apple");
	      p.add("Mango");
	      p.add("Guava");
	      p.add("Orange");
	      p.add("Peach");
	     
	      
	      Iterator i = p.iterator();
	      
	      String o = "";
	      
	      while (i.hasNext()) {
	         o = (String) i.next();
	         if (o.equals("Orange")) {
	            i.remove();
	            
	            System.out.println("\nThe element Orange is removed");
	            
	            System.out.println(p.size());
	            
	            
	         }
	      }
	      
	      
	      
	      
	   }
	}



