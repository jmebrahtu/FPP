package prob4;

public class HourlyEmployee extends Employee {
  double wage;
  double hour;
  
  public  HourlyEmployee(String firstName,String lastName,String Ssn,double wage,double hour) {
	  super(firstName,lastName,Ssn);
		  this.wage=wage;
		  this.hour=hour;
		  
	  }

public double getWage() {
	return wage;
}

public void setWage(double wage) {
	this.wage = wage;
}

public double getHour() {
	return hour;
}

public void setHour(double hour) {
	this.hour = hour;
}

@Override
public double getPayment() {
	
	return wage*hour;
}

@Override
public String toString() {
	return "HourlyEmployee [wage=" + wage + ", hour=" + hour + "]";
}
	

  }

