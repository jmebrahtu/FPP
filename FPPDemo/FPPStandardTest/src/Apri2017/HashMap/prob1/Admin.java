package Apri2017.HashMap.prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		
		HashMap<Key,Student>stu= new HashMap<Key,Student>();
		Key p= null;
		for (Student x : students) {
		p =new Key( x.getFirstName(), x.getLastName());
			stu.put(p,x );
		}
		
		return stu;
	}
}
