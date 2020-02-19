package lab1.prog1;

public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee("Point", 2019, 10, 3);
		// System.out.println(employee);

		employee.createSavingAccount(300);
		employee.createCheckingAccount(300);
		employee.createRitiremntAccount(300);
		//System.out.println(employee.getFormattedInfo());

		Employee bob = new Employee("bob", 2019, 10, 3);
		bob.createSavingAccount(500);
		bob.createCheckingAccount(500);
		//System.out.println(bob.getFormattedInfo());

		Employee jirom = new Employee("jirom", 2019, 10, 3);
		jirom.createCheckingAccount(600);
		jirom.createCheckingAccount(600);
		jirom.createRitiremntAccount(600);
		// System.out.println(jirom.getFormattedInfo());
		
		
		//Employee[] empr = new Employee[3];
	Employee[]empr= {employee,bob,jirom};
	for (Employee employee2 : empr) {
		System.out.println(employee2.getFormattedInfo());
		
	}
	}
}