package July2017.poly.solution;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		double sum=0.0;
		//List<Employee>acc= new ArrayList<Employee>();
		     for (Employee employee : emps) {
		    List<Account> accc= employee.getAccounts();
		    for (Account rr : accc) {
				sum+=rr.getBalance();
			}
			}
		
		return sum;
	}
}
