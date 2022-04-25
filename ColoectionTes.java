package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class ColoectionTes {
public static void main(String[] args) {
	Collection c = new ArrayList();
	
	c.add("Who are you");
	c.add("Why you are here");
	c.add("What is your age");
	//Methods
	System.out.println("Length Of Collection :" + c.size());
	
	
	for (Object ele : c){
		System.out.println(ele);
	}
	
	Object[] oArray = c.toArray();
	
	for (Object ele : oArray){
		String s = (String) ele;
		System.out.println(s);
	}
}
}
