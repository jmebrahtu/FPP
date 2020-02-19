package lab1.pro4;

public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee("Mike", 2019, 10, 3);
		// System.out.println(employee);
		//employee.createRitiremntAccount(300);
		employee.createSavingAccount(300);
		employee.createCheckingAccount(300);
		
		//System.out.println(employee.getFormattedInfo());

		Employee bob = new Employee("Robiel", 2019, 10, 3);
		bob.createCheckingAccount(500);
		bob.createSavingAccount(500);
		
		//System.out.println(bob.getFormattedInfo());

		Employee jirom = new Employee("Jirom", 2019, 10, 3);
		jirom.createRitiremntAccount(600);
		jirom.createCheckingAccount(600);
		jirom.createCheckingAccount(600);
		
		// System.out.println(jirom.getFormattedInfo());
		
		
		//Employee[] empr = new Employee[3];
	Employee[]empr= {employee,bob,jirom};
	for (Employee employee2 : empr) {
		System.out.println(employee2.getFormattedInfo());
		
	}
	}
}