package collectionFramework;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Marksheet>{

	
	public int compare(Marksheet o1, Marksheet o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
