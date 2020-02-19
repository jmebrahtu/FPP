package lab8.pro6.comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if( Double.compare(o1.getSalary(),o2.getSalary())!=0){
			return Double.compare(o1.getSalary(),o2.getSalary());
		}
		return o1.getName().compareTo(o2.getName());
	}

	

}
