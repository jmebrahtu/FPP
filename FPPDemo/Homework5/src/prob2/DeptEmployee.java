package prob2;

import java.time.LocalDate;

public abstract class DeptEmployee {
	String Name;
	double Salary;
	LocalDate hiredate ;
	
	DeptEmployee(String Name,double Salary,int year,int month,int day){
		this.Name=Name;
		this.Salary=Salary;
		this.hiredate=LocalDate.of( year, month, day);
		
		
	}
// Getter and setter
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	 
	
	public  double computeSalary() {
		return this.Salary;
		
	}
	@Override
	public String toString() {
		return "DeptEmplyee [Name=" + Name + ", Salary=" + Salary + ", hiredate=" + hiredate + "]";
	}
	}


