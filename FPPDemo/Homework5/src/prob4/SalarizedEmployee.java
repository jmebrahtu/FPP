package prob4;

public class SalarizedEmployee extends Employee{

	
	double weeklySalary;
	
 public SalarizedEmployee(String firstName,String lastName,String Ssn,double weeklySalary) {
	 super(firstName,lastName,Ssn);
	 this.weeklySalary= weeklySalary;
		 
	 }

public double getWeeklySalary() {
	return weeklySalary;
}

public void setWeeklySalary(double weeklySalary) {
	this.weeklySalary = weeklySalary;
}

@Override
public double getPayment() {
	
	return weeklySalary;
}

@Override
public String toString() {
	return "SalarizedEmployee [weeklySalary=" + weeklySalary + "]";
}

 }
	
	

