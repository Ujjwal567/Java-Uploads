package cloning;

public class BankAcc implements Cloneable {

	public double balance = 0;
	public String accounttype = "Savings";	
	
	public BankAcc (double f, String g){
		accounttype = g;
		balance = f;
	}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}


public static void main(String[] args) throws CloneNotSupportedException {
	BankAcc a1 = new BankAcc(56, "Savings");
	BankAcc a2 =  (BankAcc) a1.clone();
	
	//a2.balance = 45;
	//a2.accounttype = "Current";
	
	System.out.println(a1.balance);
	System.out.println(a1.accounttype);
	System.out.println(a2.balance);
	System.out.println(a2.accounttype);
	
	
	
	
}




}
