package Exesice;

public class palindrome {
	public static void main(String[] args) {
		
		int n=151, rev=0, rem=0;
		int i=n;
		
		while(n>0){
			
			rem=n%10;
			rev = rev*10+rem;
			n=n/10;
			}
		System.out.println(rev);
		if(i==rev){
			System.out.println(i+" is a palindrome number");
		}else{
			System.out.println(i +" is not a palindrome  ");
		}
	}

}
