package Poly2018;

public class CheckingAccount implements AccountInter{
	private double balance;

	public CheckingAccount(double balance) {
		this.balance = balance;
	}

	public double computeTotal() {

		if (balance <= 10000) {
			balance = balance + balance * 0.01;
		}
		if (balance > 10000) {
			balance = balance + balance * 0.03;
		}
		return balance;
	}

}