package exerciseExceptionHandling;

public class ExceptionE {
public static void main(String[] args) {
	int i = 0;
	
	try {
		double div = 9/i;
		System.out.println(div);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	//can handle all type of exception
}
}

