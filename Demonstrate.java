package exerciseExceptionHandling;

public class Demonstrate {
public static void main(String[] args) throws StringIndexOutOfBoundsException  {
	String s = "Ujjwal";
	
	
	try {
		System.out.println(s.indexOf(8));
		System.out.println(s.length());
		System.out.println(s.charAt(9));
	} catch (IndexOutOfBoundsException e) {
		System.out.println("String is small"); 
	}catch (NullPointerException e) {
		System.out.println("Can't be null");
	}
}
}
