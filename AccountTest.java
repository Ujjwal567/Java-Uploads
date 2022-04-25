package accountop;

public class AccountTest {
public static void main(String[] args) {
Account l = new Account();

	l.setnumber("123456789");
	l.settype("Current");
	
	
	
	System.out.println(l.gettype());
	System.out.println(l.getnumber());
	System.out.println(l.getbalance());
	
}
}
