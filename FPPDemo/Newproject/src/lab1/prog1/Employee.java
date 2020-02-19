 package lab1.prog1;

import java.time.LocalDate;

public class Employee {
	private String name;
	private Account Savingacc;
	private Account Checkingacc;
	private Account Retirimentacc;
	LocalDate hireDate;

	public Employee(String name, int year, int month, int dayOfMonth) {
		this.name = name;
		this.hireDate = LocalDate.of(year, month, dayOfMonth);
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {

		return hireDate;
	}

	public String getFormattedInfo() { 
	    	String result= "ACCOUNT INF FOR "+this.getName()+":\n"+this.getHireDate();
	    	if(Savingacc!=null)
	    	result+= Savingacc.toString()+"\n";
	    	if(Checkingacc!=null)
	    	result+= Checkingacc.toString()+"\n";
	    	if(Retirimentacc!=null)
	    	result+= Retirimentacc.toString()+"\n";
	    	return result;
	    }

	public void createSavingAccount(double startBal) {
		this.Savingacc = new Account(startBal, AccountType.SAVINGS, this);
		
	}

	public void createCheckingAccount(double startBal) {
		this.Checkingacc = new Account(startBal, AccountType.CHECKING, this);
	}

	public void createRitiremntAccount(double startBal) {
		this.Retirimentacc = new Account(startBal, AccountType.REITIRMENT, this);
	}

	public void Deposit(AccountType type, double amount) {
		switch (type) {
		case SAVINGS:
			Savingacc.makeDeposit(amount);
			break;
		case CHECKING:

			Checkingacc.makeDeposit(amount);
			break;
		case REITIRMENT:

			Retirimentacc.makeDeposit(amount);
			break;
		default:
			break;
		}

	}

	public boolean Withdraw(AccountType type, double amount) {
		switch (type) {
		case SAVINGS:
			return Savingacc.makeWithdraw(amount);

		case CHECKING:
			return Checkingacc.makeWithdraw(amount);

		case REITIRMENT:
			return Retirimentacc.makeWithdraw(amount);

		default:
			return false;
		}

	}

}
