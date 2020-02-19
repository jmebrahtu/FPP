package lab11.pro2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {

	/**
	 * Returns a list of Employees whose social security number is on the input list
	 * socSecNums and whose salary is > 80000. The list must be ordered by social
	 * security number, from lowest to highest. To sort, you must use a Collections
	 * sorting method and you must define your own Comparator to be used to compare
	 * Employees by ssn.
	 */
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		// IMPLEMENT
		List<Employee> emp = new ArrayList<Employee>();
		for (String employee : socSecNums) {
			if (table.containsKey(employee))
				;
			Employee d = table.get(employee);
			if (d!=null&& d.getSalary() > 80000) {

				emp.add(d);
			}

		}
		// Collections.sort(emp, (o1,o2)->o1.getSsn().compareTo(o2.getSsn()));
		return emp;
	}

	/**
	 * Returns a list of Employees whose social security number is not in the input
	 * list socSecNums
	 */
	public static List<Employee> findSsnIsNotInList(HashMap<String, Employee> table, List<String> socSecNums) {
		// IMPLEMENT
		List<Employee> num = new ArrayList<Employee>();// create list of Employees whose social security number is not in the input
		                                                      // * list socSecNums
		for (String employee : table.keySet()) {//searching each employee in the table by finding thier key
			if (!socSecNums.contains(employee)) {//that checks if the employee that are in the table does not exist their of ssn in 
				Employee d = table.get(employee);// then we accept for those by creating data type and by calling get method

				num.add(d);//finally we add those employee in the list 
			}
		}
		return num;
	}
}