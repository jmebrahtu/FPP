package prob2;

public class Professor extends DeptEmployee {
	
	int noofpublication;
	
	 Professor(String Name,double Salary,int year, int month,int day, int noofpublication){
		 super(Name,Salary,year,month,day);
		 this.noofpublication= noofpublication;
		 
	 }

	public int getNoofpublication() {
		return noofpublication;
	}

	public void setNoofpublication(int noofpublication) {
		this.noofpublication = noofpublication;
	}

}
