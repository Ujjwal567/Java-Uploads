package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator4 implements Comparator{
	
	
	 
	    
	    public static void main(String[] args)
	    {
	 
	        
	        ArrayList<Comparator1> ar = new ArrayList<Comparator1>();
	 
	        ar.add(new Comparator1(111, "Ujjwal", "london"));
	        ar.add(new Comparator1(131, "Ajay", "nyc"));
	        ar.add(new Comparator1(121, "Vijay", "jaipur"));
	        ar.add(new Comparator1(101, "Khush", "Hongkong"));
	 
	        
	 
	      }

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return 0;
		}
	}



