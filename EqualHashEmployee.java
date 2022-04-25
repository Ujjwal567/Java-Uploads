package collectionFrameworkExrecise;

public class EqualHashEmployee {
public static void main(String[] args) {
		
	Overide h = new Overide(1, "Ujjwal");
	Overide h2 = new Overide(1, "Ram");

	        System.out.println("h hashcode = " + h.hashCode());
	        System.out.println("h2 hashcode = " + h2.hashCode());
	        System.out.println(" equality  he1 and he2 = " + h.equals(h2));
		
	    }
}
