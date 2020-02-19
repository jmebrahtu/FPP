package lab1.pro5;

public class Manager  extends Employee{
	double bonus;

	 Manager(String name,double salary,int year,int month,int dayOfMonth ,double bonus){
		 super(name,salary,year,month,dayOfMonth);
        this.bonus= bonus;// intilazation the bonus;
	 }

	public void setBonus(double bonus) {
	      this.bonus= bonus;
	}
	@Override
	 public double getSalary() {// no direct access for the variable in the super class so we use super
		return	 super.getSalary()+bonus;
		 
	 }

	
	}
	
	

