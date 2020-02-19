package lesson3Question2;

public class Account {
	private double balance; 
	private AccountType acctType;  
	private Employee employee;    
	
	private final static double DEFAULT_BALANCE = 0.0;

	Account(Employee emp, AccountType acctType, double balance) {
		this.employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		// implement

		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		if (amount > balance) {
			return false;
		} else {
			balance = amount;
			return true;
		}

	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}

}
