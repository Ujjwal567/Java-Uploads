package collectionFramework;
import java.util.ArrayList;



public class ListMethods{

		public static void main(String[] args) {
			ArrayList c = new ArrayList();
			c.add("Ram");
			c.add("Shayam");
			c.add("Mohan");
			c.add("Sohan");
			c.add("Ajay");
			c.add("Vijay");
			
			System.out.println("Size: " + c.size());
			
			System.out.println(c.get(0));//Returns an object
			System.out.println(c.get(1));
			
			System.out.println(c.remove(3));//Remove an object
	
			System.out.println(c.set(2, "Rahul"));//Replace an element with respective index no 
			
			System.out.println(c.subList(1, 4));//Print Specific portion
			
			System.out.println(c.indexOf("Ram"));
			
			System.out.println(c.lastIndexOf("Shayam"));
			
			//Search an element
			int ind = c.indexOf(3);
			System.out.println("Index " + ind);

		}
	}

	

