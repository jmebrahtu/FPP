 package lab1.pro4;

public class SavingAccount  extends Account{
	
	
	SavingAccount(double balance, Employee employee) {
		super(balance,employee);
		
	}
	public AccountType getAcctTYpe() {
		return AccountType.SAVINGS;
	}
}
