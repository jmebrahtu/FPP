package lesson3Question2;

public class Main {


		public static void main(String[] args) {
			
			Employee e1 = new Employee("Jirom", "Jerry", 2000, 2018, 03, 20);
			
			Account a1 = new Account(e1, AccountType.CHECKING, 500.00);
			Account a2 = new Account(e1, AccountType.SAVING, 500.00);
			Account a3 = new Account(e1, AccountType.RETITEMENT, 500.00);
			
			System.out.println(e1.toString());
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			
			a1.makeDeposit(500);
			System.out.println(a1);
			System.out.println(a2.makeWithdrawal(300.00));
			System.out.println(a3.makeWithdrawal(100.00));
			
		
		}

	}



