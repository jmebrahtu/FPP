package lab2.prog3;

public class Secratery  extends DeptEmployee {
	 private double overtime;
	
	
	public Secratery(String name,double Salary,int year,int month,int DayOfMonth,double overtime) {
		super(name,Salary,year,month,DayOfMonth);
		this.overtime= overtime;
	}


	public double getOvertime() {
		return overtime;
	}


	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}
	@Override
  public double  computeSalary() {
	 return  super.computeSalary()*12 ;
}
}
