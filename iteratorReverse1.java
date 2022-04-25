package collectionFramework;

import java.util.*;

public class iteratorReverse1 {
	// Java program to iterate List in Reverse Order
		public static void main(String[] args){
			
			ArrayList l = new ArrayList();

			
			l.add("Ujjwal");
			l.add("Ajay");
			l.add("Vijay");

			// Generate an Listiterator to iterate l in reverse order
			ListIterator g = l.listIterator(l.size());

			
			// previous elements
			while (g.hasPrevious())
			{
				// Iterate in reverse
				System.out.println(g.previous());
			}

			
			
			
			
			
		}
	}



