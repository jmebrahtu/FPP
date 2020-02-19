package prob2;

public class Secretary extends DeptEmployee {
	double overtimehour;
	
	 public Secretary(String Name,double Salary,int year ,int month,int day,double overtimehour){
		 super(Name,Salary,year,month,day);
		 this.overtimehour=overtimehour;
		
	}

	public double getOvertimehour() {
		return overtimehour;
	}

	public void setOvertimehour(double overtimehour) {
		this.overtimehour = overtimehour;
	}

	@Override
	public double computeSalary() {
		
		return super.computeSalary()+12*overtimehour;
	}
	
		
	}

