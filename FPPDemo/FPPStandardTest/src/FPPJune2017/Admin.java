package FPPJune2017;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static List<Student> convertArray(Object[] studentArray) {
		List<Student>converted= new ArrayList<Student>();//change from object list to student list
		for (Object object : studentArray) {// used for loop to get each student
			Student s= (Student)object;//make down casting to get specific student
			converted.add(s);// add the student in the list
		}
		
		return converted; // return all the list 
	}
	
	
	public static double computeAverageGpa(List<Student> studentList) {
		double sum=0.0;
		for (Student student : studentList) {// to sum each gpa of the sudent we use for loop 
			sum+= student.computeGpa(); // and sum each gpa of the student
			
		}
		
		return sum/studentList.size(); //return the average gpa by sum divide of all the course they taken
	}
}
