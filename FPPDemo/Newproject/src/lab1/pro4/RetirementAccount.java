package lab1.pro4;

public class RetirementAccount  extends Account{

	
	RetirementAccount(double balance,Employee employee){
		super( balance,employee);
	}
	public AccountType getAcctTYpe() {
		 return AccountType.REITIRMENT;
	}
}
