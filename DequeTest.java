package collectionFramework;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTest {
public static void main(String[]args){
	Deque a = new LinkedList();
	a.addFirst("Ujjwal");
	a.addLast("Ajay");
	a.addFirst("Vijay");
	a.addLast("Sohan");
	
	System.out.println(a.size());
	System.out.println(a.removeFirst());
	System.out.println(a.removeFirstOccurrence("Ajay"));
	System.out.println(a.getFirst());
	System.out.println(a.getLast());
	
}
}
