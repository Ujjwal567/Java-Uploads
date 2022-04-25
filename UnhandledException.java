package exerciseExceptionHandling;

public class UnhandledException {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two values");

		int val1 = sc.nextInt(); 
		int val2 =  sc.nextInt(); 
		double result = val1/val2;
		System.out.println("result "+result);  // this statement does not execute

	}
}
