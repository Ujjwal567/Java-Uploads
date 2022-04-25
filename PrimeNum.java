package Exesice;

public class PrimeNum {
	public static void main(String[] args) {
		
		int n=7;
	int	prime=0;
	
	for(int i=2; i<=n-1; i++){
		if(n%i==0){
			prime=prime+1;
		}
	}
		if(prime==0){
			System.out.println(n+" is prime number");
		}else {
			System.out.println(n+ " is not a prime number");
		
	}
	}

}
