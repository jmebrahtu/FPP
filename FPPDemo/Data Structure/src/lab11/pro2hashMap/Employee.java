package lab11.pro2hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord = new HashMap();// we must use constractor if
																					// nullpointexception

	public void addEntry(String date, double salary) {// put in the entry or the table
		salaryRecord.put(date, salary);
		// implement
	}

	public void printPaymentAmount(String date) {// in this by using the key i will print the pay checking
		if (salaryRecord.containsKey(date)) {
			System.out.println(firstName + lastName + "was paid "
					+ salaryRecord.get(date) + date);
		} else {
			System.out.println(firstName + lastName + "did not recive a paycheck on" + date);
		}
	}

	public void printAveragePaycheck() {// To get the average paycheck using the hashmap
		// simply want to find the average value
		double total = 0.0;
		for (Double sco : salaryRecord.values()) {
			total += sco.doubleValue();
		}
//		
		System.out.println(total / salaryRecord.size());
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for (int i = 0; i < 12; ++i) {
			e.addEntry(i + "/15/2011", 3070 + 5 * i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
