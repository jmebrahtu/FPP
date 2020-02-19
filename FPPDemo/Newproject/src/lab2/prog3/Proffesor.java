package lab2.prog3;

public class Proffesor extends DeptEmployee{
	
	
        int numberofpublication;
	
	Proffesor(String name,double Salary,int year,int month,int DayOfMonth,int numberofpublication){
	super(name,Salary,year,month,DayOfMonth);
	this.numberofpublication=numberofpublication;
	}

	public int getNumberofpublication() {
		return numberofpublication;
	}

	public void setNumberofpublication(int numberofpublication) {
		this.numberofpublication = numberofpublication;
	}
	
}
