package Poly2018;

public class SavingsAccount implements AccountInter {
	private double balance;
	private double interest;

	public SavingsAccount(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
	}

	public double computeTotal() {
		return balance + (balance * interest / 100);
	}

}
