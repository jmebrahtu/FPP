package lab1.pro4;

public abstract class Account {// abstaract class
	double balance;
	Employee Employee;

	abstract public AccountType getAcctTYpe(); // abstract method

	public Account(Employee employee) {// constractor with one input
		Employee = employee;

	}

	public Account(double balance, Employee employee) {// constractor with two input
		this.balance = balance;
		Employee = employee;
	}

	double getBalance() {// getter method
		return balance;
	}

	public void makeDeposit(double amount) {// additional given method
		this.balance = balance + amount;

	}

	public boolean makeWithdraw(double amount) {// additional given boolean method
		if (amount > balance) {
			return false;
		} else {
			this.balance = balance - amount;
		}
		return true;
	}

	@Override
	public String toString() { // Override the string method that helps
		return "Account Type: " + getAcctTYpe() + "Current Bal: " + balance + "\n";
	}

}
