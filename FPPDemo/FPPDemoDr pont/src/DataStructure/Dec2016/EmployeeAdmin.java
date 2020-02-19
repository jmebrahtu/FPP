package DataStructure.Dec2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
     class SsnComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.getSsn().compareTo(o2.getSsn());
		}
    	 
     }
public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		
			
		
		List<Employee>num= new ArrayList<Employee>();// list of employee
		    for (String x  : socSecNums) {// loop these employee who have ssn
		    	Employee z= table.get(x);//check if these employee are in the table and put on z
				if(z!=null&& z.getSalary()> 80000) {
					num.add(z);
					
					SsnComparator best= new SsnComparator();
					 Collections.sort(num,best);
			}
				
			}
		    System.out.println(num.toString());
			return num;
		
		
	}
	
}
