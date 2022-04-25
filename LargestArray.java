package Exesice;

import java.util.Arrays;

public class LargestArray {
	public static int getLargest(int[] h, int total){  
		Arrays.sort(h);  
		return h[total-1];  
		}  
		public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		  
		System.out.println("Largest: "+getLargest(a,6));  
		
		
		}
		}  


