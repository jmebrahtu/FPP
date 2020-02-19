package Jan2017;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {

		double sum = 0.0;

		for (Employee employee : emps) {
			List<Account> accounts = employee.getAccounts();
			for (Account acc : accounts) {
				sum += acc.getBalance();

			}

		}
		return sum;
	}

}
