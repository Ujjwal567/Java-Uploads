package exceptionHandling;

public class FamilyPropagationCheked {
public static void main(String[] args) {
	dad();
}

private static void dad() {
	try {
		mom();
	} catch (MistakeException e) {
		System.out.println(e.getMessage());
	}
	
}

private static void mom() throws MistakeException {
	son();
	
}

private static void son() throws MistakeException{
	MistakeException e = new MistakeException();
	throw e ;
	
}
}
