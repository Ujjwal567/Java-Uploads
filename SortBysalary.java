package collectionFrameworkExrecise;

import java.util.Comparator;

public class SortBysalary implements Comparator<SortEmployee>{

public int compare(SortEmployee a, SortEmployee b) {
	if(a.salary==b.salary)  
		return 0;  
		else if(a.salary>b.salary)  
		return 1;  
		else  
		return -1; 
}
}
