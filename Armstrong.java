package Exesice;

public class Armstrong {
	public static void main(String[] args) {

        int number = 278, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        
        if(result == number)
            System.out.println( " is an Armstrong number:"+number);
        else
            System.out.println(" is not an Armstrong number:"+number);
    }

}
