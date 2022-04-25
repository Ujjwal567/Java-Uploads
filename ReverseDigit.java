package Exesice;

public class ReverseDigit {
	  public static void main(String[] args) {
		  
		    int n = 5678, reversed = 0;   
		    
		    while(n != 0) {
		    
		      int digit = n % 10;
		      reversed = reversed * 10 + digit;

		      n /= 10;
		    }

		    System.out.println("Reversed Number: " + reversed);
		  }
}
