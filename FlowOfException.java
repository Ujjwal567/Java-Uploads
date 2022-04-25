package exceptionHandling;

public class FlowOfException {
public static void main(String[] args) {
	String s = "Ujjwal";
	try {
		System.out.println("Length of Ujjwal " + s.length());
		System.out.println("Char at 9th positio " + s.charAt(9));
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println("String is Small");
	}catch (RuntimeException e) {
		System.out.println("aacha naam h");
	}finally {
		System.out.println("Always is there fianlly");
	}
	
	
	
	
	
}
}
