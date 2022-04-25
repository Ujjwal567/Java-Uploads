package exceptionHandling;

public class UnchekedPropaga {
public static void main(String[] args) {
	dad();
}
public static void dad(){
	try {
		mom();
	} catch (RuntimeException e) {
		System.out.println("CAUGHT BY DAD RAISED BY SON");
	}
}
private static void mom() {
son();	
}
private static void son() {
	RuntimeException e = new RuntimeException("I made a mistake");
	throw e;
	
}
}
