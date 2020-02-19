package Homework12;


	public class CustomerAccount { 
		private String Cus_name; 
		private int Acc_no; 
		private double Balance; 
	
	 
	 public CustomerAccount(String cus_name, int acc_no, double balance) {  
		 super(); 
	 
	  Cus_name = cus_name;   Acc_no = acc_no;   Balance = balance;  } 
	 
	 public void deposit(double deposit) {  
		 Balance = Balance + deposit;   
		 try {    if(Balance<100) { 
			 throw new Exceptionclas(); 
			 }else {  
				
	System.out.println("curent balance is "+ Balance);  
	}   
		 }catch (Exceptionclas e) { 
	 }
	 
	  }  
	 
	 public void withdrow(double take) throws Exceptionclas {   
		 double z=Balance-take; 
		 try {  
			 if (z<0) {  
				 throw new Exceptionclas(z);  
				 }  
			 else {     Balance=Balance-take;    } 
			 } catch (Exceptionclas e) { 
	 }
	 
	  } 
	 
	 
	 
	 public String getCus_name() {   return Cus_name;  } 
	 
	 public void setCus_name(String cus_name) {   Cus_name = cus_name;  } 
	 
	 public int getAcc_no() {   return Acc_no;  } 

	  public void setAcc_no(int acc_no) {   Acc_no = acc_no;  } 
	 
	 public double getBalance() {   return Balance;  } 
	 
	 public void setBalance(double balance) {   Balance = balance;  } 
	 
	 public static void main(String[] args) throws Exceptionclas { 
		 // TODO Auto-generated method stub 
	 
	 
	  CustomerAccount a = new CustomerAccount("yare", 88, 10);
	  a.withdrow(99);  
	  System.out.println();
	  a.deposit(200); 
	  a.deposit(200);  
	  a.deposit(200); 
	  a.deposit(200); 
	
	}
	}
