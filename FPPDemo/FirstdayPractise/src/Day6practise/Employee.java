package Day6practise;

public class Employee  extends Person{
	
	public Employee(){
		this("(2) invike Employee's overloaded constractor");
		System.out.println("(3) Employee's no- arg constractor is invoked ");
	}
	public Employee(String s){
		System.out.println(s);
	}
} 
 