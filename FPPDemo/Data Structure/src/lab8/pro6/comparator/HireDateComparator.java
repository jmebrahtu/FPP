package lab8.pro6.comparator;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getHireDate().compareTo(o2.getHireDate())!=0){
		return 	o1.getHireDate().compareTo(o2.getHireDate());
		}
		return Double.compare(o1.getSalary(),o2.getSalary());
	}

}
