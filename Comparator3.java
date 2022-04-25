package collectionFramework;

import java.util.Comparator;

public class Comparator3 {
	// Helper class implementing Comparator interface
	class Sortbyname implements Comparator<Comparator1> {
	 
	    

		@Override
		public int compare(Comparator1 o1, Comparator1 o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o1.name);
		}
	}

}
