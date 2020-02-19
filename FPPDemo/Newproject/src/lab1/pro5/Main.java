package lab1.pro5;

public class Main {

	public static void main(String[] args) {

		Manager boss = new Manager("Steve", 40000.0, 2019, 5, 12,10000.0);
		Employee e1 = new Employee("Bob", 85000.0, 1999, 5, 12);
		Employee e2= new Employee("Harry", 50000.0, 2000, 5, 12);

		Employee[] staff = { e1, e2, boss };
		for (Employee employee : staff) {
			System.out.println("name="+employee.getName()+"\n"+ "salary="+employee.getSalary()+"\n"+ "hireDate="+employee.getHireDate());

		}
		

	}

}

