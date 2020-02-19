package June2017.pro1polymor;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {
		List<Student>Convert = new ArrayList<Student>();
		  for (Object object : studentArray) {
			  Student x= (Student)object;
			  Convert.add(x);
		}
		
		return Convert;
	}
	
	
	public static double computeAverageGpa(List<Student> studentList) {
		double aver= 0.0;
		for (Student student : studentList) {
			aver+= student.computeGpa();
			
		}
		return aver/studentList.size();
	}
}
