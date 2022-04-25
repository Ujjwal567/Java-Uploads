package collectionFrameworkExrecise;

import java.util.ArrayList;
import java.util.Collections;


public class TestSortSalary {
	public static void main(String[] args){
 
        ArrayList<SortEmployee> ar = new ArrayList<SortEmployee>();
        
        ar.add(new SortEmployee(100000, "Ujjwal"));
        ar.add(new SortEmployee(20000, "Ajay"));
        ar.add(new SortEmployee(10000, "Ravi"));
        ar.add(new SortEmployee(8000, "Mohan"));
        
        
        
        Collections.sort(ar, new SortBysalary());
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
          
        System.out.println("Sorted by salary");
        
}
}
	