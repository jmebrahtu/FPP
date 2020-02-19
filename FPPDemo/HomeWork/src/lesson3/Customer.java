package lesson3;

public class Customer {
	//attribute/field
	private  String firstName;
	private String lastName;
	private String sociSecurityNum;
	  Address billingAddress;
		Address shippingAddress;

	  
public Customer(String firstName,String lastName, String sociSecurityNum) {//constructor
	 
	this.firstName=firstName;
	this.lastName=lastName;
	this.sociSecurityNum=sociSecurityNum;

  
	

}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastNme() {
	return lastName;
}


public void setLastNme(String lastNme) {
	this.lastName = lastNme;
}


public String getSociSecurityNum() {
	return sociSecurityNum;
}


public void setSociSecurityNum(String sociSecurityNum) {
	this.sociSecurityNum = sociSecurityNum;
}


public Address getBillingAddress() {
	return billingAddress;
}


public void setBillingAddress(Address billingAddress) {
	this.billingAddress = billingAddress;
}


public Address getShippingAddress() {
	return shippingAddress;
}


public void setShippingAddress(Address shippingAddress) {
	this.shippingAddress = shippingAddress;
}
public String toString() { 
	  return "[" + firstName + ", " + lastName + ", " + "ssn: " + sociSecurityNum + "]"; 
	 } 

}

