package exceptionHandling;

public class ArthematicexceptionHandling  {
	public static void main(String[] args) { 
		
		int i = 0;
		
		/*double div = 9/i;
		System.out.println(div);*/
		
		try {
			double div = 9/i;
			System.out.println("division is"+ div);
		} catch (ArithmeticException e) {
			System.out.println(" Can't divide by Zero ");
		}
		
		
	}
}
