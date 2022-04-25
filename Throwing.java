package exceptionHandling;

public class Throwing {
	//programatic exception
	public static boolean isValidUser(){
	return false;
}
	public static void main(String [] args){
		boolean userFound = isValidUser();
	
	if (userFound){
		System.out.println("Valid");
	}else{
		RuntimeException  e=new RuntimeException ();
		throw e ;
	}
	
	
	
	}//end	
}//end
