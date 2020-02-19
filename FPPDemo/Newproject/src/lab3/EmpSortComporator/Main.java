package lab3.EmpSortComporator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> emplist = Arrays.asList(new Employee("bob", 5000), 
				new Employee("Alice", 3000),
				new Employee("Steve", 7000));
// to see the list of EMployee
		//System.out.println(emplist);

		// Normal implementation by Salary; by invoke the name list and the class you
		// want to sort with new
		//Collections.sort(emplist, new SalaryComporator());
		 //System.out.println(emplist);
		
		 //NameComparator myname= new  NameComparator();
		 Collections.sort(emplist,new  NameComparator() );
         System.out.println(emplist);
		//System.out.println(emplist.toString());
         
		// sort name by using Anonymous Class
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}

		});

		// by using Anonymous calss sort by salary
		Collections.sort(emplist, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o1.getSalary(), o2.getSalary());
			}

		});

		// Lambda// sort by salary
		Collections.sort(emplist, (o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()));
		Collections.sort(emplist, (e1, e2) -> e1.getName().compareTo(e2.getName()));
	}

}