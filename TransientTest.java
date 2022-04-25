package inputOutput;

import java.io.Serializable;

public class TransientTest implements Serializable{
	
	String name = null;
	int Accountancy = 0;
	int Economics= 0;
	int Business = 0;
	
	transient int total = 0 ;

	
}
