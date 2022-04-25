package exceptionHandling;

public class GenericCatch {
	public static void main(String[] args) {
		
	
String o = "UJJWAL";
	try {
		System.out.println("length is "+o.length());
		System.out.println("Char at 9 "+o.charAt(9));
	} catch (Exception e) {
		System.out.println("Error "+ e.getMessage());
		//System.out.println(""+ e.getLocalizedMessage());
		//System.out.println(""+e.getStackTrace());
	}

}
}