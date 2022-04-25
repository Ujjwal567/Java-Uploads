package collectionFramework;
import java.util.ArrayList;
import java.util.Iterator;



public class IteratorTes {

		public static void main(String[] args) {

			ArrayList c = new ArrayList();

			c.add("Ram");
			c.add("Shyam");
			c.add("Jai");
			c.add("Vijay");
			
			Iterator it = c.iterator();
			
			System.out.println(it.hasNext());
			
			//c.add("Ajay");
			
			while (it.hasNext()) {
				//Object o = it.next();
				
				System.out.println(it.next());
			}
			
	


}
}

