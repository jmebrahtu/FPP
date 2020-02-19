package ArraySortingsample;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		List<Employee> aList = Arrays.asList(new Employee("Bob", 20000),
				new Employee("Harry", 6000000), new Employee("Steven", 30000),
				new Employee("Regis", 50000),new Employee("Tony", 40000));
		System.out.println(empsToNames(aList));
	}

	static List<String> empsToNames(List<Employee> list) {
		list.forEach(name->System.out.println(name));
		// use the new forEach method to return in a list
		// the names of the Employees in the input list
		return null;
	}
}
