package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableTest {
public static void main(String[]args){
	ArrayList Comparable1 = new ArrayList();
	
	Comparable1.add(new Comparable1 ("A1", "Ajay o","89","Delhi"));
	Comparable1.add(new Comparable1 ("A2","Vijay p","99","Mumbai"));
	Comparable1.add(new Comparable1 ("A3","Ajay  k","99","Indore"));

	Collections.sort(Comparable1);
	for(Object o : Comparable1){
		System.out.println(o);
	}
	
}
}
