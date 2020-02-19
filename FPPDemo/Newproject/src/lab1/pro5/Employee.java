package lab1.pro5;

import java.time.LocalDate;

public class Employee {
	String name;
	double salary;
	LocalDate hireDate;

	public Employee(String name, double salary, int year, int month, int dayOfMonth) {
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.of(year, month, dayOfMonth);
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void  raiseSalary(double byPercent) {//NB
		  double raise= salary*byPercent/100;
		salary+=raise;
	}

	

	
}
