package lab1.pro4;

public class CheckingAccount extends Account {

	 CheckingAccount(double balance,Employee employee){
		 super(balance,employee);
			 
	
	 }

	@Override
	public AccountType getAcctTYpe() {
		
		return AccountType.CHECKING;
	}
}
