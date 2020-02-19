package prob4;

public class CommisionEmployee extends Employee{
	
   private  double grossSales;
   private  double commisionRate;
   
   public  CommisionEmployee(String firstName,String lastName,String Ssn, double grossSales, double commisionRate) {
	   super(firstName,lastName,Ssn);
	   this.grossSales=grossSales;
	   this.commisionRate=commisionRate;
	   
   }

public double getGrossSales() {
	return grossSales;
}

public void setGrossSales(double grossSales) {
	this.grossSales = grossSales;
}

public double getCommisionRate() {
	return commisionRate;
}

public void setCommisionRate(double commisionRate) {
	this.commisionRate = commisionRate;
}

@Override
public double getPayment() {
	
	return ((grossSales * commisionRate) / 100);
}

@Override
public String toString() {
	return "CommissionEmployee [getPaymentAmount()=" + getPayment() + ", toString()=" + super.toString()
	+ "]";
}
   
	   
   
}
