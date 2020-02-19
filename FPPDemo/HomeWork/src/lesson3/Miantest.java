package lesson3;

public class Miantest {

	public static void main(String[] args) {
		//creating 3 customer object
		 Customer a1=new  Customer("Jirom","Hiyabu","3425");
		 Customer a2=new  Customer("Selam","Essiet","3456");
		 Customer a3=new  Customer("betie","tesfy","6758");
		 
		 // creating 3 billing address object
		 Address c1= new Address("1976","Oakland","CA","9456");
		  Address c2= new Address("1989","Hustoun","Tx","9460");
		 Address c3= new Address("1976","Chicago"," Illinois","9476");
	a1.setBillingAddress(c1);
	a2.setBillingAddress(c2);
	a3.setBillingAddress(c3);
	Customer[]cus= new Customer[3];
	cus[0]=a1;
	cus[1]=a2;
	cus[2]=a3;
	for(Customer x:cus) {
		if(x.getBillingAddress() .getCity().equals("Chicago")){
			System.out.println(x);
		}
		
	}
	
	
	
	
	}
}
