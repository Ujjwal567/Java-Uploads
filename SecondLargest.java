package Exesice;

public class SecondLargest {
	public static void main(String args[]){
	      int g, s;
	      int array[] = {10, 20, 30, 40, 50, 1};
	      s = array.length;

	      for(int i = 0; i<s; i++ ){
	         for(int k = i+1; k<s; k++){

	            if(array[i]>array[k]){
	               g = array[i];
	               array[i] = array[k];
	               array[k] = g;
	            }
	         }
	      }
	      System.out.println(" second largest number is:: "+array[s-2]);
	   }
	


}
