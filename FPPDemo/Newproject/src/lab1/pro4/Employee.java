package lab1.pro4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	LocalDate hireDate;
	
	 /* private Account Savingacc; private Account Checkingacc; private Account
	 * Retirimentacc;*/
	 
	
	private List<Account> accounts;

	public List<Account> getAccounts() {// this method list type that contians accounttype
		return accounts;
	}

	public Employee(String name, int year, int month, int dayOfMonth) {// constractor 
		this.name = name;
		this.hireDate = LocalDate.of(year, month, dayOfMonth);
	     this.accounts= new ArrayList<Account>();// NB we are creating object in this
	}

	public String getName() {// getter method
		return name;
	}

	public LocalDate getHireDate() { //getter method

		return hireDate;

	}

	public String getFormattedInfo() {// additional given method 
		String result = "ACCOUNT INF FOR " + this.getName() +"\n";
		
		 /* if(Savingacc!=null) result+= Savingacc.toString()+"\n"; if(Checkingacc!=null)
		 * result+= Checkingacc.toString()+"\n"; if(Retirimentacc!=null) result+=
		 * Retirimentacc.toString()+"\n"; return result;*/
		 
		for (Account account : accounts) {
			result+= account.toString();
			
		}
		return result;
	}

	public void createSavingAccount(double startBal) {
		// this.Savingacc = new Account(startBal, AccountType.SAVINGS, this);
		Account savingacc = new SavingAccount(startBal, this);//create object saving and add th 
		accounts.add(savingacc);
	}
	  public void Deposit(int type, double amount) {
		  Account selected= accounts.get(type);
			selected.makeDeposit(amount);
		}
	public void createCheckingAccount(double startBal) {
		// .Checkingacc = new Account(startBal, AccountType.CHECKING, this);
		Account checkingAcc = new CheckingAccount(startBal, this);
		accounts.add(checkingAcc);
	}

	public void createRitiremntAccount(double startBal) {
		// this.Retirimentacc = new Account(startBal, AccountType.REITIRMENT, this);
		Account retiremnetacc = new RetirementAccount(startBal, this);
		accounts.add(retiremnetacc);
	}

	
	public  boolean Withdraw(int type, double amount) {
		
		Account selected= accounts.get(type);
		return selected.makeWithdraw(amount);
		}

	}


		  
		/*  switch (type) { case
	  SAVINGS: Savingacc.makeDeposit(amount); break; case CHECKING:
	 * 
	 * Checkingacc.makeDeposit(amount); break; case REITIRMENT:
	 * 
	 * Retirimentacc.makeDeposit(amount); break; default: break; }
	 * 
	 * }
	 */

