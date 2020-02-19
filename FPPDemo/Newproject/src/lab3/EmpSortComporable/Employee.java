package lab3.EmpSortComporable;

public class Employee implements Comparable<Employee> {
	// this comparable interface have one parameter and have a method knowns as
	// compareTo()
	private String name;
	private double Salary;

	Employee(String name, double Salary) {
		this.name = name;
		this.Salary = Salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", Salary=" + Salary + "]";
	}

	@Override
	public int compareTo(Employee o) {

		return Double.compare(this.getSalary(), o.getSalary());
	}

}
