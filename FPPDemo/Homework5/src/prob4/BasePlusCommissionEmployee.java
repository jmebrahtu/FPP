package prob4;

public class BasePlusCommissionEmployee extends CommisionEmployee {
	 double baseSalary;

public BasePlusCommissionEmployee(String firstName,String lastName,String Ssn, double grossSales, double commisionRate,double baseSalary) {
		super(firstName, lastName, Ssn, grossSales, commisionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
 
	@Override
	public double getPayment() {
		
		return (baseSalary + super.getPayment());
	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [toString()=" + super.toString() + ",getPaymentAmount()="
				+ getPayment() + "]";
	}
}
