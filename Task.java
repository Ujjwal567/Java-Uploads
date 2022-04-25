package exceptionHandling;

public class Task {
public static void main(String[] args) {
		
		int i = 0;
		String s ="Ujjwal";
		
		
		
		/*double div = 9/i;
		System.out.println(div);
		*/
		
		
		/*	Simple Try Catch
		try {
			double div = 9/i;
			System.out.println("Division is "+ div);
		} catch (ArithmeticException e) {
			System.out.println("Cant Divide by zero");
		}

		*/
		

		
		
		/* Try inside Try(Error)
		try {
			double div = 9/i;
			System.out.println("Division is "+ div);
			try {
				System.out.println(s.length());
			}
		} catch (ArithmeticException e) {
			System.out.println("Cant Divide by zero");
		}
*/
		
		
		
		try {
			double div = 9/i;
			System.out.println("Division is "+ div);
			}
			catch (Exception e) {
				System.out.println("Can't Divide by zero");
			}

		
		
		
		
		
	}	//end 	
} // end
