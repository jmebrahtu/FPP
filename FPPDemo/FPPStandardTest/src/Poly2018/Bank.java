package Poly2018;

import java.util.*;

import Jan2017.Account;

//You are not allowed to remove the 'final' keyword.
//You are allowed to change Object type in addAccount to another type, as necessary
public final class Bank {

	private List<AccountInter> accountList = new ArrayList<>();

	public void addAccount(AccountInter account) {
		accountList.add(account);
	}

	// IMPLEMENT - polymorphically determine the totals of
	// each account and then return the sum of all these totals
	public double computeBalanceSum() {
		double sum = 0.0;
		for (AccountInter acc: accountList) {
			sum+=acc.computeTotal();
		}
		return sum;
	}

}
