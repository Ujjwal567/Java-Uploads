package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map {
	
	
	
		public static void main(String[] args) {

			HashMap map = new HashMap();

			// Store key and value pair
			map.put("1", "Ram");
			map.put("2", "Shyam");
			map.put("3", "Mohan");
			map.put("4", "Rohan");

			// Get element by Key
			System.out.println(map.get("3"));
			
			//map.clear();//clears all mapping

			System.out.println(map.containsKey("3"));
			System.out.println(map.containsValue("Rohan"));
			
			System.out.println(map.size());//Size 
			System.out.println(map.entrySet());//gives set of key values pair
			System.out.println(map.get("3"));//gives the value
			System.out.println(map.isEmpty());//tell map is empty or not
			System.out.println(map.keySet());//print key set
			map.put("5", "Ajay");//add value
			map.remove("4");//remove specific element
			System.out.println(map.values());
			
			
		}


}