package lab8.por4.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
	//implement
	@Override
	public int compare(Employee o1, Employee o2) {
		
		 if( o1.getName().compareTo(o2.getName())!=0);
		 return o1.getName().compareTo(o2.getName());
		
	}
   
	
}
