package exerciseoop;

public class Employee   {
	
	
	


private String LocalAddress;
private String AddressPermanent;

private String LocalAddress2;
private String AddressPermanent2;

private String LocalAddress3;
private String AddressPermanent3;


public Employee(String LocalAddress, String AddressPermanent, String LocalAddress2, String AddressPermanent2, String LocalAddress3, String AddressPermanent3) {
	this.AddressPermanent = AddressPermanent;
	this.AddressPermanent2 = AddressPermanent2;
	this.AddressPermanent3 = AddressPermanent3;
	this.LocalAddress = LocalAddress;
	this.LocalAddress2 = LocalAddress2;
	this.LocalAddress3 = LocalAddress3;
}

public String getLocalAddress() {
	return LocalAddress;
}

public void setLocalAddress(String localAddress) {
	LocalAddress = localAddress;
}

	public String getAddressPermanent() {
	return AddressPermanent;
	}
	
	public void setAddressPermanent(String addressPermanent) {
	AddressPermanent = addressPermanent;
	}
	
public String getLocalAddress2() {
	return LocalAddress2;
}

public void setLocalAddress2(String localAddress2) {
	LocalAddress2 = localAddress2;
}

	public String getAddressPermanent2() {
	return AddressPermanent2;
	}
	
	public void setAddressPermanent2(String addressPermanent2) {
	AddressPermanent2 = addressPermanent2;
	}
public String getLocalAddress3() {
return LocalAddress3;
}

public void setLocalAddress3(String localAddress3) {
	LocalAddress3 = localAddress3;
}
	public String getAddressPermanent3() {
	return AddressPermanent3;
	}
	
	public void setAddressPermanent3(String addressPermanent3) {
	AddressPermanent3 = addressPermanent3;
	}

	 @Override
	    public String toString() {
	        return LocalAddress+""+LocalAddress2+""+LocalAddress3+""+AddressPermanent+""+AddressPermanent2+""+AddressPermanent3;
	    }


}
