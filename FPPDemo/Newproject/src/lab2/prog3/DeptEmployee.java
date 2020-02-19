package lab2.prog3;

import java.time.LocalDate;

public class  DeptEmployee {
   private  String name;
    private double Salary;
       private LocalDate hireDate;
   
  public   DeptEmployee( String name,double Salary,int year,int month,int DayOfMonth){
	     this.name= name;
	     this.Salary=Salary;
	     this.hireDate=LocalDate.of(year, month, DayOfMonth);
	     
	   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public LocalDate getHireDate() {
	return hireDate;
}

public void setHireDate(LocalDate hireDate) {
	this.hireDate = hireDate;
}
    public double computeSalary() {
    	return Salary;
    }

	@Override
	public String toString() {
		return "DeptEmployee [name=" + name + ", Salary=" + Salary + ", hireDate=" + hireDate + "]";
	}
    
}
