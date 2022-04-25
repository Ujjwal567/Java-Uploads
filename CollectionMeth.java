package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMeth {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("Who are you");
		c.add("Why you are here");
		c.add("What is your age");
		//Methods
		
		c.add("Ujjwal");
		c.addAll(c);
		//c.clear();
		System.out.println("Membership "+c.contains(c));
		System.out.println("Inclusion Membership "+c.containsAll(c));
		System.out.println("Is Empty "+c.isEmpty());
		System.out.println("Returns iterator "+ c.iterator());
		System.out.println("Removes an element "+ c.remove(2));
		System.out.println("Removes all element "+ c.removeAll(c));
		System.out.println("Retins an element "+ c.retainAll(c));
		
		
		System.out.println("Length Is "+ c.size());
		
	}
}
