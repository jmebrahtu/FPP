package lab8.por4.comparator;

import java.util.Arrays;
import java.util.Collections;

public class Employee {
	// instance fields
	private String name;
	private double salary;

	// constructor
	Employee(String aName, double aSalary) {
		name = aName;
		salary = aSalary;

	}

	// instance methods
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		
		//create employee array with three employees
		Employee[]emp= {new Employee("robiel",2000),
				new Employee("jirom",3000),
				new Employee("mike",4000)};
		
   NameComparator num= new NameComparator();
			Arrays.sort( emp,num);
	 
		
	for (Employee employee : emp) {
		System.out.println(employee);
	}
		//Use Arrays.sort();
		
		//Use Collections.sort();
		
		//print your employee array
	
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}
