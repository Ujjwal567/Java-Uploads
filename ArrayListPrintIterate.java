package collectionFrameworkExrecise;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListPrintIterate {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("Who are you");
		c.add("Why you are here");
		c.add("What is your age");
		
		java.util.Iterator it = c.iterator();
		while (it.hasNext()){
			String s = (String) it.next();
			System.out.println(s);
		}
			
}
}