package prob4;

public abstract class Employee {
	 private String firstName;
	  private String lastName;
	 private String Ssn;
	
	Employee(String firstName,String lastName,String Ssn){
		this. firstName=firstName;
		this.lastName=lastName;
		this.Ssn=Ssn;
		
	}
public abstract  double getPayment();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return Ssn;
	}

	public void setSsn(String ssn) {
		Ssn = ssn;
	}

	}


