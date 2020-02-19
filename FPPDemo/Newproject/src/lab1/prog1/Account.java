package lab1.prog1;

public class Account {
	private double balance;
	AccountType accounttype;
	Employee Employee;

	public Account(AccountType accounttype, Employee employee) {
		this.accounttype = accounttype;
		Employee = employee;

	}

	public Account(double balance, AccountType accounttype, Employee employee) {

		this.balance = balance;
		this.accounttype = accounttype;
		Employee = employee;
	}

	double getBalance() {
		return balance;
	}

	public void makeDeposit(double amount) {
		this.balance = balance + amount;

	}

	public boolean makeWithdraw(double amount) {
		if (amount > balance) {
			return false;
		} else {
			this.balance = balance - amount;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Account Type: " + accounttype + "\n" + "Current Bal: " + balance;
	}

}
