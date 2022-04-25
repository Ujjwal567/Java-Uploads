package collectionFramework;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	
	
		public static void main(String[] args) {
			//LinkedList queue = new LinkedList();
			Queue queueA = new LinkedList();
			
			// Add elements to queue
			queueA.offer("Ram");
			queueA.offer("Shyam");
			queueA.offer("Rocky");
			queueA.offer("Vijay");
			//size
			System.out.println("Size is "+queueA.size());
			
			
			// Retrieve  but do not remove
			System.out.println(queueA.peek());
			
			
			// Retrieve and remove the head
			System.out.println(queueA.poll());
			
			
			//Retrieve and remove head
			System.out.println(queueA.remove());
			
		}

	}


