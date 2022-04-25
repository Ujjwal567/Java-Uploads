package exceptionHandling;

public class MultipleCatchBlocks {
public static void main(String[] args) {
	String s = null;
	
	try {
		
		System.out.println(s.charAt(9));
		System.out.println(s.length());
	} catch (NullPointerException e) {
		System.out.println("Name can not be null");
		
	}catch (StringIndexOutOfBoundsException e) {
		System.out.println("String is small");
	}
	finally {
		System.out.println("finally is Always");
	}
}
}
