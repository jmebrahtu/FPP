package lab3.EmpSortComporable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static <T> void main(String[] args) {
		List<Employee> emplist = Arrays.asList(new Employee("bob", 5000), new Employee("Alice", 3000),
				new Employee("Steve", 7000));
		System.out.println(emplist);

		Collections.sort(emplist);

		System.out.println(emplist);

	}
}
