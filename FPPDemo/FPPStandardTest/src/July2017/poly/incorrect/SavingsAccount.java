package July2017.poly.incorrect;

public final class SavingsAccount {
	public SavingsAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}
	double balance;
	double interestRate;
	public double getBalance() {
		double newbalance = balance + interestRate * balance;
		return newbalance;
	}
	
	
}
